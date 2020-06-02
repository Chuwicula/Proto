/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.querys.facade;

import DAO.EntityManager;
import entidades.querys.notResolvetoday.NotResolveToday;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import org.hibernate.transform.Transformers;

/**
 *
 * @author ncabrejo
 */
@Stateless
public class QuerysFacade {

    private final EntityManager em = EntityManager.getInstance("/hibernate.cfg.xml");

    public List<NotResolveToday> runListQuery(HashMap hm, String sql) {
        try {

            return (List<NotResolveToday>) em.selectNativoSql(hm, sql, Transformers.aliasToBean(NotResolveToday.class));
        } catch (Exception ex) {
            Logger.getLogger(QuerysFacade.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
