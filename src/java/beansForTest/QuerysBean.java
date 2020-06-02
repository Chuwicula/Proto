/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beansForTest;

import entidades.querys.facade.QuerysFacade;
import entidades.querys.notResolvetoday.NotResolveToday;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author ncabrejo
 */
@ViewScoped

@ManagedBean(name = "QuerysBean")
public class QuerysBean implements Serializable {

    private List<NotResolveToday> notResolveTodays;

    @EJB
    QuerysFacade querysFacade;

    @PostConstruct
    public void init() {

    }

    public void loadNotResolveTodays() {

        HashMap hm = new HashMap();
        Date today = new Date();
        hm.put("date", today.getYear() + 1900 + "-" + today.getMonth() + 1 + "-" + today.getDate());
        String query = "SELECT c.user_id as user_id, c.name as name FROM Users c WHERE c.user_id "
                + "NOT IN (SELECT b.daily_report_user_id FROM DailyReport b WHERE DATE(b.daily_report_date) = current_date())";
        notResolveTodays =  querysFacade.runListQuery(null, query);
        if(notResolveTodays != null){
            System.out.println(notResolveTodays.size()+"+---");
           
        }
    }

    /**
     * @return the notResolveTodays
     */
    public List<NotResolveToday> getNotResolveTodays() {
        return notResolveTodays;
    }

    /**
     * @param notResolveTodays the notResolveTodays to set
     */
    public void setNotResolveTodays(List<NotResolveToday> notResolveTodays) {
        this.notResolveTodays = notResolveTodays;
    }

}
