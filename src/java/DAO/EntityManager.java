package DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.hibernate.FlushMode;
import org.hibernate.Query;
import org.hibernate.Session;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javassist.convert.Transformer;
import org.hibernate.NonUniqueObjectException;
import org.hibernate.Hibernate;
import org.hibernate.transform.ResultTransformer;
import org.hibernate.transform.Transformers;
import util.Utilidades;

/**
 * Esta clase permite realizar las operaciones basicas en base de datos usando
 * la session de hibernate
 */
public class EntityManager {

    private final TransactionManager transactionManager;//Administrador de sesiones
    private final String ruta;//Ruta de archivo de configuracion de hibernate.xml
    private Session session; // archivo de session de hibernate que permitira realizar todas las operaciones en base de datos
    private Connection con; //Conexión a la base de datos para realizar consultas a la base de datos
    /*
     * Singleton
     */
    private static List<EntityManager> instancias;//Coleccion de instancias del administrador de entidades

    private EntityManager(String ruta) {
        this.ruta = ruta;
        this.transactionManager = TransactionManager.getInstance(ruta);
    }

    /**
     * Carga la instancia con la base de datos por defecto para el entity
     * manager
     *
     * @param ruta
     * @return
     */
    public synchronized static EntityManager getInstance(String ruta) {
        if (instancias == null) {
            instancias = new ArrayList<>();
            instancias.add(new EntityManager(ruta));
            return instancias.get(0);
        }
        for (EntityManager element : instancias) {
            if (element.ruta.equals(ruta)) {
                return element;
            }
        }
        EntityManager nuevaInstancia = new EntityManager(ruta);
        instancias.add(nuevaInstancia);
        return nuevaInstancia;
    }

    //____________________________LECTURA__________________________________
    /**
     * @param param
     * @param nameQuery
     * @return boolean
     * @throws Exception
     */
    public Object selectNameQueryParam(HashMap param, String nameQuery) throws Exception {
        Object retorno = null;
        try {
            abrirSession();
            Query query = session.getNamedQuery(nameQuery);

            Iterator it = param.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry e = (Map.Entry) it.next();
                query.setParameter(e.getKey().toString(), e.getValue());
            }
            query.setReadOnly(false);
            param.clear();

            retorno = query.uniqueResult();
        } catch (Exception e) {
            //Logger.getLogger(EntityManager.class.getName()).log(Level.SEVERE, null, e);
            if (session.getTransaction().isActive()) {
                session.getTransaction().rollback();
            }
            e.getMessage();
            e.printStackTrace();
            //session.clear();
        } finally {
            cerrarSession();
        }
        return retorno;
    }

    public void inicarObjecto(Object object) {
        try {
            abrirSession();
            Hibernate.initialize(object);

        } catch (Exception ex) {
            Logger.getLogger(EntityManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            cerrarSession();
        }
    }

    public Object selectNameQueryParamList(HashMap param, String nameQuery) throws Exception {
        try {
            abrirSession();
            Query query = session.getNamedQuery(nameQuery);
            if (param != null) {
                Iterator it = param.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry e = (Map.Entry) it.next();
                    query.setParameter(e.getKey().toString(), e.getValue());
                }
            }
            query.setReadOnly(false);

            if (query == null || query.list() == null || query.list().isEmpty()) {
                System.out.println("Null");
                return null;
            }
            return query.list();

        } catch (Exception ex) {
            ex.printStackTrace();
            if (session.getTransaction().isActive()) {
                session.getTransaction().rollback();
            }
            return null;
        } finally {
            cerrarSession();
        }
    }

    public Object selectNameQueryUniqueResult(String nameQuery) throws Exception {
        try {
            abrirSession();
            Query query = session.getNamedQuery(nameQuery);
            query.setReadOnly(false);
            return query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return null;
        } finally {
            cerrarSession();
        }
    }

    public Object selectNameQueryParamListMultipleEst(HashMap param, String nameQuery) throws Exception {
        try {
            abrirSession();
            Query query = session.getNamedQuery(nameQuery);
            if (param != null) {
                Iterator it = param.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry e = (Map.Entry) it.next();
                    query.setParameter(e.getKey().toString(), e.getValue());
                }
            }

            query.setReadOnly(false);
            return query.list();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            ex.getMessage();
            return null;
        } finally {
            cerrarSession();
        }
    }

    @SuppressWarnings("unchecked")
    public Object selectNativo(HashMap param, String sql) throws Exception {
        try {

            abrirSession();
            Query query = session.createQuery(sql);
            if (param != null) {
                Iterator it = param.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry e = (Map.Entry) it.next();
                    query.setParameter(e.getKey().toString(), e.getValue());
                }
            }
            query.setReadOnly(false);

            return query.list();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Exepcion entity Manager");
            return null;
        } finally {
            cerrarSession();
        }
    }


    public Object selectNativoSql(HashMap param, String sql, ResultTransformer transformers) throws Exception {
        try {
            abrirSession();
            Query query = session.createQuery(sql);
            query.setResultTransformer(transformers);
            if (param != null) {
                Iterator it = param.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry e = (Map.Entry) it.next();
                    query.setParameter(e.getKey().toString(), e.getValue());
                }
            }
            query.setReadOnly(false);

            return query.list();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Exepcion entity Manager");
            return null;
        } finally {
            cerrarSession();
        }
    }

    //___________________________ESCRITURA_________________________________
    //__________________________MODIFICACION_______________________________
    //Metodo que recibe una entidad y su clase y realiza un insert o un update en
    //la base de datos
    public boolean save2(Object entity, String clase) throws Exception {
        try {
            abrirSession();
            session.beginTransaction();
            try {
                System.out.println("Object Saved-*-*-*-*-*-**--*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--**-*-*--*-*-*-");
                session.saveOrUpdate(entity);
                if (!session.getTransaction().wasCommitted()) {
                    session.getTransaction().commit();
                }
            } catch (Exception e) {
                //session.clear();
                e.printStackTrace();
                try {
                    Object merged = session.merge(clase, entity);
                    session.saveOrUpdate(merged);
                    if (!session.getTransaction().wasCommitted()) {
                        session.getTransaction().commit();
                    }
                    System.out.println("Object Merged +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
                } catch (Exception ex) {
                    if (session.getTransaction() != null && session.getTransaction().isActive()) {
                        session.getTransaction().rollback();
                    }
                    Utilidades.imprimir_msg("Error", "Hubo inconsistencia en el guardado");
                    ex.printStackTrace();
                }
            }
            return true;
        } catch (NonUniqueObjectException e) {
            System.out.println("?????????????????????????????????DUPLICADO *************/*/*/*/*/*/*/*/*/**/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
            try {
                abrirSession();
                Object nuevo = session.merge(clase, entity);
                session.saveOrUpdate(clase, nuevo);
                if (!session.getTransaction().wasCommitted()) {
                    session.getTransaction().commit();
                }
                System.out.println("Duplicado guardado");
                return true;
            } catch (Exception exec) {
                System.out.println("NO SE PUDOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
                e.printStackTrace();
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            if (session.getTransaction().isActive()) {
                session.getTransaction().rollback();
            }
            Utilidades.imprimir_msg("Error", "Error al ejecutar comando");
            return false;
        } finally {
            cerrarSession();
        }
    }

    //METODO QUE ACTUALIZA LOS REGISTROS
    public void update() {
        try {
            abrirSession();
            session = transactionManager.getCurrentSession();
            session.clear();//ACA SE HACE CONSULTA A LA BASE DE DATOS
            if (session == null) {
                System.out.println("Sesion Nula");
            }
            if (session.isOpen()) {
                System.out.println("Sesion abierta");
            }
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            cerrarSession();
        }
    }

    //Metodo que actualiza un objeto, recibe como parametro el objeto y hace la
    //actualizacion en la base de datos. 
    public boolean actualizar(Object entity) {
        try {
            abrirSession();
            session.beginTransaction();
            session.merge(entity);
            if (!session.getTransaction().wasCommitted()) {
                session.getTransaction().commit();
            }
            System.out.println("Object Merged");
        } catch (Exception e) {
            e.printStackTrace();
            Utilidades.imprimir_msg("Error", "No se pudieron guardar los datos");
        } finally {
            cerrarSession();
        }
        return false;
    }

    //___________________________ELIMINACION_______________________________
    /**
     *
     * @param entity
     * @return
     * @throws Exception
     */
    public boolean delete(Object entity) throws Exception {
        abrirSession();
        session.beginTransaction();
        try {
            System.out.println("Delete Object Initial");
            session.delete(entity);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            try {
                System.out.println("Delete Object Merged");
                Object nuevo = session.merge(entity);
                session.delete(nuevo);
                session.getTransaction().commit();
                return true;
            } catch (Exception e2) {
                System.out.println("Error in delete");
                e.getMessage();
                e.printStackTrace();
                //System.out.println(e.getMessage());
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
                //session.clear();
                return false;
            }

        } finally {
            cerrarSession();
        }

    }

    /**
     *
     * @return @throws Exception
     */
    public Session getSession() throws Exception {
        abrirSession();
        return session;
    }

    /**
     * @return the con
     */
    public Connection getCon() {
        return con;
    }

    /**
     * Permite abrir la conexion para hibernate, en caso de que esta ya no este
     * abierta
     *
     * @throws Exception
     */
    public void abrirSession() throws Exception {
        if (session != null && session.isOpen()) {
            return;
        }
        session = transactionManager.getCurrentSession();
        session.setFlushMode(FlushMode.AUTO);
    }

    //Este metodo permite actualizar una entidad de la  base dedatos
//    public void actualizar(Object objeto) {
//        session.refresh(objeto);
//    }
    /**
     * Si la conexion esta abierta permite cerrarla
     */
    public void cerrarSession() {
        if (session == null || !session.isOpen()) {
            return;
        }
        session.close();
    }

    public void SQLQuery(String sentencia, HashMap param) {
        try {
            try {
                abrirSession();
                session.beginTransaction();
            } catch (Exception e) {
                e.printStackTrace();
                //("Sesion ya iniciada");
            }
            Query query = session.createSQLQuery(sentencia);

            if (param != null) {
                Iterator it = param.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry e = (Map.Entry) it.next();
                    //System.out.println("key: " + e.getKey().toString() + "\n" + "value: " + e.getValue());
                    query.setParameter(e.getKey().toString(), e.getValue());
                }
            }
            int rowCount = query.executeUpdate();

            if (!session.getTransaction().wasCommitted()) {
                session.getTransaction().commit();
            }

        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            cerrarSession();
        }
    }

    public void borrarHQL(String sentencia, HashMap param) {
        try {
            try {
                abrirSession();
                session.beginTransaction();
            } catch (Exception e) {
                System.out.println("1");
            }

            Query query = session.createQuery(sentencia);
            if (param != null) {
                Iterator it = param.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry e = (Map.Entry) it.next();
                    query.setParameter(e.getKey().toString(), e.getValue());
                    //System.out.println("key: " + e.getKey().toString() + "\n" + "value: " + e.getValue());
                }
            }
            int rowCount = query.executeUpdate();
            if (rowCount == 0) {
                //   System.out.println("no hubo Borrados");
            } else {
                //     System.out.println("si hubo borrados");
            }
            if (!session.getTransaction().wasCommitted()) {
                session.getTransaction().commit();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            cerrarSession();
        }

    }
}
