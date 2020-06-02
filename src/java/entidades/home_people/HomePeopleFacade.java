/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.home_people;

import DAO.EntityManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;

/**
 *
 * @author ncabrejo
 */
@Stateless
public class HomePeopleFacade {

    private final EntityManager em = EntityManager.getInstance("/hibernate.cfg.xml");

 
    
    public boolean updateHomePeople(HomePeople homePeople) {
        try {            
            try {
                return em.save2(homePeople, "HomePeople");
            } catch (Exception ex) {
                Logger.getLogger(HomePeopleFacade.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        } catch (Exception ex) {
            Logger.getLogger(HomePeopleFacade.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean SaveHomePeople(HomePeople homePeople) {
        try {
            Integer id = (Integer) em.selectNameQueryUniqueResult("getIdHP");
            try {
                homePeople.setHome_people_id(id);
                return em.save2(homePeople, "HomePeople");
            } catch (Exception ex) {
                Logger.getLogger(HomePeopleFacade.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        } catch (Exception ex) {
            Logger.getLogger(HomePeopleFacade.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean DeleteHomePeople(HomePeople homePeople) {
        try {
            return em.delete(homePeople);
        } catch (Exception ex) {
            Logger.getLogger(HomePeopleFacade.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
