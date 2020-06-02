/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.daily_report;

import DAO.EntityManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;

/**
 *
 * @author ncabrejo
 */
@Stateless
public class DailyRepotFacade {
    
    
    private final EntityManager em = EntityManager.getInstance("/hibernate.cfg.xml");

 
    
    public boolean updateDailyReport(DailyReport dailyReport) {
        try {            
            try {
                return em.save2(dailyReport, "DailyReport");
            } catch (Exception ex) {
                Logger.getLogger(DailyRepotFacade.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        } catch (Exception ex) {
            Logger.getLogger(DailyRepotFacade.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean SaveDailyReport(DailyReport dailyReport) {
        try {
            Integer id = (Integer) em.selectNameQueryUniqueResult("getIdDR");
            try {
                dailyReport.setDaily_report_id(id);
                return em.save2(dailyReport, "DailyReport");
            } catch (Exception ex) {
                Logger.getLogger(DailyRepotFacade.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        } catch (Exception ex) {
            Logger.getLogger(DailyRepotFacade.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean DeleteDailyReport(DailyReport dailyReport) {
        try {
            return em.delete(dailyReport);
        } catch (Exception ex) {
            Logger.getLogger(DailyRepotFacade.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    
}
