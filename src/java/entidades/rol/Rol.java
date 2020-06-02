/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.rol;

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
@Table(name = "rol", schema = "public")
@NamedQueries(
        @NamedQuery(name = "RolSelectAll", query = "SELECT c FROM Rol c")
)
public class Rol implements Serializable {

    @Id
    private Integer rol_id;
    private String rol_name;
    @OneToMany(mappedBy = "rol_id")
    private List<Users> userss;

    public Rol() {

    }

    /**
     * @return the rol_id
     */
    public Integer getRol_id() {
        return rol_id;
    }

    /**
     * @param rol_id the rol_id to set
     */
    public void setRol_id(Integer rol_id) {
        this.rol_id = rol_id;
    }

    /**
     * @return the rol_name
     */
    public String getRol_name() {
        return rol_name;
    }

    /**
     * @param rol_name the rol_name to set
     */
    public void setRol_name(String rol_name) {
        this.rol_name = rol_name;
    }

}
