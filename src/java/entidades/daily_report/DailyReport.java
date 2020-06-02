/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.daily_report;

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
@Table(name = "daily_report", schema = "public")
@NamedQueries(
        @NamedQuery(name = "getIdDR", query = "SELECT CASE WHEN MAX(c.daily_report_id) IS NULL THEN 1 ELSE (MAX(c.daily_report_id) + 1) END FROM DailyReport c")
)
public class DailyReport implements Serializable {

    @Id
    private Integer daily_report_id;
    private Boolean daily_report_user_tos;
    private Double daily_report_user_fever;
    private Boolean daily_report_user_casancio;
    private Boolean daily_report_user_secrecion_nasal;
    private Boolean daily_report_user_dificultad_respirar;
    private Boolean daily_report_user_dolor_garganta;
    private String daily_report_user_otros_sintomas;
    private Boolean daily_report_user_corona_advice;
    private Boolean daily_report_user_secretaria_advice;
    private Boolean daily_report_user_eps_advice;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date daily_report_date;

    @ManyToOne
    @JoinColumn(name = "daily_report_user_id")
    private Users daily_report_user_id;

    public DailyReport() {

    }

    /**
     * @return the daily_report_user_fever
     */
    public Double getDaily_report_user_fever() {
        return daily_report_user_fever;
    }

    /**
     * @param daily_report_user_fever the daily_report_user_fever to set
     */
    public void setDaily_report_user_fever(Double daily_report_user_fever) {
        this.daily_report_user_fever = daily_report_user_fever;
    }

    /**
     * @return the daily_report_id
     */
    public Integer getDaily_report_id() {
        return daily_report_id;
    }

    /**
     * @param daily_report_id the daily_report_id to set
     */
    public void setDaily_report_id(Integer daily_report_id) {
        this.daily_report_id = daily_report_id;
    }

    /**
     * @return the daily_report_user_tos
     */
    public Boolean getDaily_report_user_tos() {
        return daily_report_user_tos;
    }

    /**
     * @param daily_report_user_tos the daily_report_user_tos to set
     */
    public void setDaily_report_user_tos(Boolean daily_report_user_tos) {
        this.daily_report_user_tos = daily_report_user_tos;
    }

    /**
     * @return the daily_report_user_cansancio
     */
    public Boolean getDaily_report_user_casancio() {
        return daily_report_user_casancio;
    }

    /**
     * @param daily_report_user_casancio the daily_report_user_cansancio to set
     */
    public void setDaily_report_user_casancio(Boolean daily_report_user_casancio) {
        this.daily_report_user_casancio = daily_report_user_casancio;
    }

    /**
     * @return the daily_report_user_secrecion_nasal
     */
    public Boolean getDaily_report_user_secrecion_nasal() {
        return daily_report_user_secrecion_nasal;
    }

    /**
     * @param daily_report_user_secrecion_nasal the
     * daily_report_user_secrecion_nasal to set
     */
    public void setDaily_report_user_secrecion_nasal(Boolean daily_report_user_secrecion_nasal) {
        this.daily_report_user_secrecion_nasal = daily_report_user_secrecion_nasal;
    }

    /**
     * @return the daily_report_user_dificultad_respirar
     */
    public Boolean getDaily_report_user_dificultad_respirar() {
        return daily_report_user_dificultad_respirar;
    }

    /**
     * @param daily_report_user_dificultad_respirar the
     * daily_report_user_dificultad_respirar to set
     */
    public void setDaily_report_user_dificultad_respirar(Boolean daily_report_user_dificultad_respirar) {
        this.daily_report_user_dificultad_respirar = daily_report_user_dificultad_respirar;
    }

    /**
     * @return the daily_report_user_dolor_garganta
     */
    public Boolean getDaily_report_user_dolor_garganta() {
        return daily_report_user_dolor_garganta;
    }

    /**
     * @param daily_report_user_dolor_garganta the
     * daily_report_user_dolor_garganta to set
     */
    public void setDaily_report_user_dolor_garganta(Boolean daily_report_user_dolor_garganta) {
        this.daily_report_user_dolor_garganta = daily_report_user_dolor_garganta;
    }

    /**
     * @return the daily_report_user_otros_sintomas
     */
    public String getDaily_report_user_otros_sintomas() {
        return daily_report_user_otros_sintomas;
    }

    /**
     * @param daily_report_user_otros_sintomas the
     * daily_report_user_otros_sintomas to set
     */
    public void setDaily_report_user_otros_sintomas(String daily_report_user_otros_sintomas) {
        this.daily_report_user_otros_sintomas = daily_report_user_otros_sintomas;
    }

    /**
     * @return the daily_report_user_corona_advice
     */
    public Boolean getDaily_report_user_corona_advice() {
        return daily_report_user_corona_advice;
    }

    /**
     * @param daily_report_user_corona_advice the
     * daily_report_user_corona_advice to set
     */
    public void setDaily_report_user_corona_advice(Boolean daily_report_user_corona_advice) {
        this.daily_report_user_corona_advice = daily_report_user_corona_advice;
    }

    /**
     * @return the daily_report_user_secretaria_advice
     */
    public Boolean getDaily_report_user_secretaria_advice() {
        return daily_report_user_secretaria_advice;
    }

    /**
     * @param daily_report_user_secretaria_advice the
     * daily_report_user_secretaria_advice to set
     */
    public void setDaily_report_user_secretaria_advice(Boolean daily_report_user_secretaria_advice) {
        this.daily_report_user_secretaria_advice = daily_report_user_secretaria_advice;
    }

    /**
     * @return the daily_report_date
     */
    public Date getDaily_report_date() {
        return daily_report_date;
    }

    /**
     * @param daily_report_date the daily_report_date to set
     */
    public void setDaily_report_date(Date daily_report_date) {
        this.daily_report_date = daily_report_date;
    }

    /**
     * @return the daily_report_user_id
     */
    public Users getDaily_report_user_id() {
        return daily_report_user_id;
    }

    /**
     * @param daily_report_user_id the daily_report_user_id to set
     */
    public void setDaily_report_user_id(Users daily_report_user_id) {
        this.daily_report_user_id = daily_report_user_id;
    }

    /**
     * @return the daily_report_user_eps_advice
     */
    public Boolean getDaily_report_user_eps_advice() {
        return daily_report_user_eps_advice;
    }

    /**
     * @param daily_report_user_eps_advice the daily_report_user_eps_advice to
     * set
     */
    public void setDaily_report_user_eps_advice(Boolean daily_report_user_eps_advice) {
        this.daily_report_user_eps_advice = daily_report_user_eps_advice;
    }

}
