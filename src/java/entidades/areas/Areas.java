/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.areas;

import entidades.users.Users;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ncabrejo
 */
@Entity
@Table(name = "areas", schema = "public")
@NamedQueries(
        @NamedQuery(name = "getAreasAll", query = "SELECT c FROM Areas c")
)
public class Areas implements Serializable {

    @Id
    private Integer area_id;
    private String area_name;

    @OneToMany(mappedBy = "area_id")
    private List<Users> userss;

    public Areas() {

    }

    /**
     * @return the area_id
     */
    public Integer getArea_id() {
        return area_id;
    }

    /**
     * @param area_id the area_id to set
     */
    public void setArea_id(Integer area_id) {
        this.area_id = area_id;
    }

    /**
     * @return the area_name
     */
    public String getArea_nombre() {
        return area_name;
    }

    /**
     * @param area_name the area_name to set
     */
    public void setArea_nombre(String area_name) {
        this.area_name = area_name;
    }

}
