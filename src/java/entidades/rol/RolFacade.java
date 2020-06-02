package entidades.rol;

import DAO.EntityManager;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;

@Stateless
public class RolFacade {

    private final EntityManager em = EntityManager.getInstance("/hibernate.cfg.xml");

    public List<Rol> getRoles() {
        List<Rol> retorno = null;
        try {
            retorno = (List<Rol>) em.selectNameQueryParamList(null, "RolSelectAll");
        } catch (Exception ex) {
            Logger.getLogger(RolFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }

}
