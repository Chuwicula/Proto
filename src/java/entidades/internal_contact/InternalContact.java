/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.internal_contact;

import entidades.home_people.HomePeople;
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
@Table(name = "internal_contact", schema = "public")
@NamedQueries(
        @NamedQuery(name = "getIdIC", query = "SELECT CASE WHEN MAX(c.internal_contact_id) IS NULL THEN 1 ELSE (MAX(c.internal_contact_id) + 1) END FROM InternalContact c")
)
public class InternalContact implements Serializable {
    
    @Id
    private Integer internal_contact_id;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date internal_contact_date;
    @ManyToOne
    @JoinColumn(name = "internal_contact_user_id")
    private Users internal_contact_user_id;
    @ManyToOne
    @JoinColumn(name = "internal_contact_home_people_id")
    private HomePeople internal_contact_home_people_id;
    private Double internal_contact_fever;
    private Boolean internal_contact_tos;
    private Boolean internal_contact_cansancio;
    private Boolean internal_contact_secrecion_nasal;
    private Boolean internal_contact_dificultad_respirar;
    private Boolean internal_contact_dolor_garganta;
    private String internal_contact_otros_sintomas;
    private Boolean internal_contact_covid_boolean;
    
    public InternalContact(){
        
    }

    /**
     * @return the internal_contact_id
     */
    public Integer getInternal_contact_id() {
        return internal_contact_id;
    }

    /**
     * @param internal_contact_id the internal_contact_id to set
     */
    public void setInternal_contact_id(Integer internal_contact_id) {
        this.internal_contact_id = internal_contact_id;
    }

    /**
     * @return the internal_contact_date
     */
    public Date getInternal_contact_date() {
        return internal_contact_date;
    }

    /**
     * @param internal_contact_date the internal_contact_date to set
     */
    public void setInternal_contact_date(Date internal_contact_date) {
        this.internal_contact_date = internal_contact_date;
    }

    /**
     * @return the internal_contact_user_id
     */
    public Users getInternal_contact_user_id() {
        return internal_contact_user_id;
    }

    /**
     * @param internal_contact_user_id the internal_contact_user_id to set
     */
    public void setInternal_contact_user_id(Users internal_contact_user_id) {
        this.internal_contact_user_id = internal_contact_user_id;
    }

    /**
     * @return the internal_contact_home_people_id
     */
    public HomePeople getInternal_contact_home_people_id() {
        return internal_contact_home_people_id;
    }

    /**
     * @param internal_contact_home_people_id the internal_contact_home_people_id to set
     */
    public void setInternal_contact_home_people_id(HomePeople internal_contact_home_people_id) {
        this.internal_contact_home_people_id = internal_contact_home_people_id;
    }

    /**
     * @return the internal_contact_fever
     */
    public Double getInternal_contact_fever() {
        return internal_contact_fever;
    }

    /**
     * @param internal_contact_fever the internal_contact_fever to set
     */
    public void setInternal_contact_fever(Double internal_contact_fever) {
        this.internal_contact_fever = internal_contact_fever;
    }

    /**
     * @return the internal_contact_tos
     */
    public Boolean getInternal_contact_tos() {
        return internal_contact_tos;
    }

    /**
     * @param internal_contact_tos the internal_contact_tos to set
     */
    public void setInternal_contact_tos(Boolean internal_contact_tos) {
        this.internal_contact_tos = internal_contact_tos;
    }

    /**
     * @return the internal_contact_cansancio
     */
    public Boolean getInternal_contact_cansancio() {
        return internal_contact_cansancio;
    }

    /**
     * @param internal_contact_cansancio the internal_contact_cansancio to set
     */
    public void setInternal_contact_cansancio(Boolean internal_contact_cansancio) {
        this.internal_contact_cansancio = internal_contact_cansancio;
    }

    /**
     * @return the internal_contact_secercion_nasal
     */
    public Boolean getInternal_contact_secercion_nasal() {
        return internal_contact_secrecion_nasal;
    }

    /**
     * @param internal_contact_secrecion_nasal the internal_contact_secercion_nasal to set
     */
    public void setInternal_contact_secercion_nasal(Boolean internal_contact_secrecion_nasal) {
        this.internal_contact_secrecion_nasal = internal_contact_secrecion_nasal;
    }

    /**
     * @return the internal_contact_dificultad_respirar
     */
    public Boolean getInternal_contact_dificultad_respirar() {
        return internal_contact_dificultad_respirar;
    }

    /**
     * @param internal_contact_dificultad_respirar the internal_contact_dificultad_respirar to set
     */
    public void setInternal_contact_dificultad_respirar(Boolean internal_contact_dificultad_respirar) {
        this.internal_contact_dificultad_respirar = internal_contact_dificultad_respirar;
    }

    /**
     * @return the internal_contact_dolor_garganta
     */
    public Boolean getInternal_contact_dolor_garganta() {
        return internal_contact_dolor_garganta;
    }

    /**
     * @param internal_contact_dolor_garganta the internal_contact_dolor_garganta to set
     */
    public void setInternal_contact_dolor_garganta(Boolean internal_contact_dolor_garganta) {
        this.internal_contact_dolor_garganta = internal_contact_dolor_garganta;
    }

    /**
     * @return the internal_contact_otros_sintomas
     */
    public String getInternal_contact_otros_sintomas() {
        return internal_contact_otros_sintomas;
    }

    /**
     * @param internal_contact_otros_sintomas the internal_contact_otros_sintomas to set
     */
    public void setInternal_contact_otros_sintomas(String internal_contact_otros_sintomas) {
        this.internal_contact_otros_sintomas = internal_contact_otros_sintomas;
    }

    /**
     * @return the internal_contact_covid_boolean
     */
    public Boolean getInternal_contact_covid_boolean() {
        return internal_contact_covid_boolean;
    }

    /**
     * @param internal_contact_covid_boolean the internal_contact_covid_boolean to set
     */
    public void setInternal_contact_covid_boolean(Boolean internal_contact_covid_boolean) {
        this.internal_contact_covid_boolean = internal_contact_covid_boolean;
    }
    
}
