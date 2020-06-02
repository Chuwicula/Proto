/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.home_people;

import entidades.internal_contact.InternalContact;
import entidades.users.Users;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ncabrejo
 */
@Entity
@Table(name = "home_people", schema = "public")
@NamedQueries(
        @NamedQuery(name = "getIdHP", query = "SELECT CASE WHEN MAX(c.home_people_id) IS NULL THEN 1 ELSE (MAX(c.home_people_id) + 1) END FROM HomePeople c")
)
public class HomePeople implements Serializable {
    
    @Id
    private Integer home_people_id;
    private String home_people_name;
    private Boolean home_people_age;
    private Boolean home_people_diseases_boolean;
    private String home_people_diseases_description;
    private String home_people_eps;
    private String home_people_arl;
    @ManyToOne
    @JoinColumn(name = "home_people_user_id")
    private Users home_people_user_id;
    @OneToMany(mappedBy = "internal_contact_home_people_id")
    private List<InternalContact> internalContacts;
    
    public HomePeople(){
        
    }

    /**
     * @return the home_people_id
     */
    public Integer getHome_people_id() {
        return home_people_id;
    }

    /**
     * @param home_people_id the home_people_id to set
     */
    public void setHome_people_id(Integer home_people_id) {
        this.home_people_id = home_people_id;
    }

    /**
     * @return the home_people_name
     */
    public String getHome_people_name() {
        return home_people_name;
    }

    /**
     * @param home_people_name the home_people_name to set
     */
    public void setHome_people_name(String home_people_name) {
        this.home_people_name = home_people_name;
    }

    /**
     * @return the home_people_age
     */
    public Boolean getHome_people_age() {
        return home_people_age;
    }

    /**
     * @param home_people_age the home_people_age to set
     */
    public void setHome_people_age(Boolean home_people_age) {
        this.home_people_age = home_people_age;
    }

    /**
     * @return the home_people_diseases_boolean
     */
    public Boolean getHome_people_diseases_boolean() {
        return home_people_diseases_boolean;
    }

    /**
     * @param home_people_diseases_boolean the home_people_diseases_boolean to set
     */
    public void setHome_people_diseases_boolean(Boolean home_people_diseases_boolean) {
        this.home_people_diseases_boolean = home_people_diseases_boolean;
    }

    /**
     * @return the home_people_diseases_description
     */
    public String getHome_people_diseases_description() {
        return home_people_diseases_description;
    }

    /**
     * @param home_people_diseases_description the home_people_diseases_description to set
     */
    public void setHome_people_diseases_description(String home_people_diseases_description) {
        this.home_people_diseases_description = home_people_diseases_description;
    }

    /**
     * @return the home_people_eps
     */
    public String getHome_people_eps() {
        return home_people_eps;
    }

    /**
     * @param home_people_eps the home_people_eps to set
     */
    public void setHome_people_eps(String home_people_eps) {
        this.home_people_eps = home_people_eps;
    }

    /**
     * @return the home_people_arl
     */
    public String getHome_people_arl() {
        return home_people_arl;
    }

    /**
     * @param home_people_arl the home_people_arl to set
     */
    public void setHome_people_arl(String home_people_arl) {
        this.home_people_arl = home_people_arl;
    }

    /**
     * @return the home_people_user_id
     */
    public Users getHome_people_user_id() {
        return home_people_user_id;
    }

    /**
     * @param home_people_user_id the home_people_user_id to set
     */
    public void setHome_people_user_id(Users home_people_user_id) {
        this.home_people_user_id = home_people_user_id;
    }
    
}
