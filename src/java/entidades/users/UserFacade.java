/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.users;

import DAO.EntityManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;

/**
 *
 * @author ncabrejo
 */
@Stateless
public class UserFacade {

    private final EntityManager em = EntityManager.getInstance("/hibernate.cfg.xml");

    public boolean saveUser(Users users) {
        try {
            return em.save2(users, "Users");
        } catch (Exception ex) {
            Logger.getLogger(UserFacade.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
    
    
        public boolean SaveNewUser(Users users) {
        try {
            Integer id = (Integer) em.selectNameQueryUniqueResult("getIdU");
            try {
                users.setUser_id(id);
                return em.save2(users, "Users");
            } catch (Exception ex) {
                Logger.getLogger(UserFacade.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        } catch (Exception ex) {
            Logger.getLogger(UserFacade.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean DeleteExternalContact(Users users) {
        try {
            return em.delete(users);
        } catch (Exception ex) {
            Logger.getLogger(UserFacade.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
