package facade;


import DAO.EntityManager;
import entidades.users.Users;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import org.mindrot.jbcrypt.BCrypt;

@Stateless
public class LoginFacade {

    private final EntityManager em = EntityManager.getInstance("/hibernate.cfg.xml");

    public Users getUserByNick(String usuario) {
        List<Users> users = null;
        HashMap hm = new HashMap();
        hm.put("user", usuario);
        try {
            users = (List<Users>) em.selectNameQueryParamList(hm, "Users.getUserByUser");
        } catch (Exception ex) {
            Logger.getLogger(LoginFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (users == null || users.isEmpty()) {
            return null;
        } else {
            return users.get(0);
        }

    }

    public boolean cambiarContrasenia(Users usuario, String pass) {
        System.out.println("Cambiando Contraseña->" + usuario.getPassword());
        try {
            usuario.setPassword(BCrypt.hashpw(pass, BCrypt.gensalt()));
            em.save2(usuario, "TUsuario");
            System.out.println("Contraseña Cambiada");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}
