/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.areas;

import DAO.EntityManager;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;

/**
 *
 * @author ncabrejo
 */
@Stateless
public class AreaFacade {

    private final EntityManager em = EntityManager.getInstance("/hibernate.cfg.xml");

    public List<Areas> getAreas() {
        List<Areas> retorno = null;
        try {
            retorno = (List<Areas>) em.selectNameQueryParamList(null, "getAreasAll");
        } catch (Exception ex) {
            Logger.getLogger(AreaFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }

}
