/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.external_contact;

import entidades.users.Users;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author ncabrejo
 */
@Entity
@Table(name = "external_contact", schema = "public")
@NamedQueries(
        @NamedQuery(name = "getIdEC", query = "SELECT CASE WHEN MAX(c.external_contact_id) IS NULL THEN 1 ELSE (MAX(c.external_contact_id) + 1) END FROM ExternalContact c")
)
public class ExternalContact implements Serializable {

    @Id
    private Integer external_contact_id;
    private String external_contact_site;
    private String external_contact_name;
    private Boolean external_contact_tapabocas;
    private Boolean external_contact_lavado_manos;
    private Boolean external_contact_limpieza_superficies;
    private Boolean external_contact_lavado_ropa;
    private Boolean external_contact_desinfeccion_zapatos;
    private Boolean external_contact_ducha;
    private String external_contact_others;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date external_contact_date;
            
    @ManyToOne
    @JoinColumn(name = "external_contact_user_id")
    private Users external_contact_user_id;
    
    public ExternalContact(){
        
    }

    /**
     * @return the external_contact_id
     */
    public Integer getExternal_contact_id() {
        return external_contact_id;
    }

    /**
     * @param external_contact_id the external_contact_id to set
     */
    public void setExternal_contact_id(Integer external_contact_id) {
        this.external_contact_id = external_contact_id;
    }

    /**
     * @return the external_contact_site
     */
    public String getExternal_contact_site() {
        return external_contact_site;
    }

    /**
     * @param external_contact_site the external_contact_site to set
     */
    public void setExternal_contact_site(String external_contact_site) {
        this.external_contact_site = external_contact_site;
    }

    /**
     * @return the external_contact_name
     */
    public String getExternal_contact_name() {
        return external_contact_name;
    }

    /**
     * @param external_contact_name the external_contact_name to set
     */
    public void setExternal_contact_name(String external_contact_name) {
        this.external_contact_name = external_contact_name;
    }

    /**
     * @return the external_contact_tapabocas
     */
    public Boolean getExternal_contact_tapabocas() {
        return external_contact_tapabocas;
    }

    /**
     * @param external_contact_tapabocas the external_contact_tapabocas to set
     */
    public void setExternal_contact_tapabocas(Boolean external_contact_tapabocas) {
        this.external_contact_tapabocas = external_contact_tapabocas;
    }

    /**
     * @return the external_contact_lavado_manos
     */
    public Boolean getExternal_contact_lavado_manos() {
        return external_contact_lavado_manos;
    }

    /**
     * @param external_contact_lavado_manos the external_contact_lavado_manos to set
     */
    public void setExternal_contact_lavado_manos(Boolean external_contact_lavado_manos) {
        this.external_contact_lavado_manos = external_contact_lavado_manos;
    }

    /**
     * @return the external_contact_limpieza_superficies
     */
    public Boolean getExternal_contact_limpieza_superficies() {
        return external_contact_limpieza_superficies;
    }

    /**
     * @param external_contact_limpieza_superficies the external_contact_limpieza_superficies to set
     */
    public void setExternal_contact_limpieza_superficies(Boolean external_contact_limpieza_superficies) {
        this.external_contact_limpieza_superficies = external_contact_limpieza_superficies;
    }

    /**
     * @return the external_contact_lavado_ropa
     */
    public Boolean getExternal_contact_lavado_ropa() {
        return external_contact_lavado_ropa;
    }

    /**
     * @param external_contact_lavado_ropa the external_contact_lavado_ropa to set
     */
    public void setExternal_contact_lavado_ropa(Boolean external_contact_lavado_ropa) {
        this.external_contact_lavado_ropa = external_contact_lavado_ropa;
    }

    /**
     * @return the external_contact_desinfeccion_zapatos
     */
    public Boolean getExternal_contact_desinfeccion_zapatos() {
        return external_contact_desinfeccion_zapatos;
    }

    /**
     * @param external_contact_desinfeccion_zapatos the external_contact_desinfeccion_zapatos to set
     */
    public void setExternal_contact_desinfeccion_zapatos(Boolean external_contact_desinfeccion_zapatos) {
        this.external_contact_desinfeccion_zapatos = external_contact_desinfeccion_zapatos;
    }

    /**
     * @return the external_contact_ducha
     */
    public Boolean getExternal_contact_ducha() {
        return external_contact_ducha;
    }

    /**
     * @param external_contact_ducha the external_contact_ducha to set
     */
    public void setExternal_contact_ducha(Boolean external_contact_ducha) {
        this.external_contact_ducha = external_contact_ducha;
    }

    /**
     * @return the external_contact_others
     */
    public String getExternal_contact_others() {
        return external_contact_others;
    }

    /**
     * @param external_contact_others the external_contact_others to set
     */
    public void setExternal_contact_others(String external_contact_others) {
        this.external_contact_others = external_contact_others;
    }

    /**
     * @return the external_contact_date
     */
    public Date getExternal_contact_date() {
        return external_contact_date;
    }

    /**
     * @param external_contact_date the external_contact_date to set
     */
    public void setExternal_contact_date(Date external_contact_date) {
        this.external_contact_date = external_contact_date;
    }

    /**
     * @return the external_contact_user_id
     */
    public Users getExternal_contact_user_id() {
        return external_contact_user_id;
    }

    /**
     * @param external_contact_user_id the external_contact_user_id to set
     */
    public void setExternal_contact_user_id(Users external_contact_user_id) {
        this.external_contact_user_id = external_contact_user_id;
    }
    
}
