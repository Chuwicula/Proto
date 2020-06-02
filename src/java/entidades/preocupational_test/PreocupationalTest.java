/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.preocupational_test;

import entidades.users.Users;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author ncabrejo
 */
@Entity
@Table(name = "preocupational_test", schema = "public")
@NamedQueries({
        @NamedQuery(name = "getIdPT", query = "SELECT CASE WHEN MAX(c.preocupational_test_id) IS NULL THEN 1 ELSE (MAX(c.preocupational_test_id) + 1) END FROM PreocupationalTest c"),
        @NamedQuery(name = "getListPTByUser", query = "SELECT c FROM PreocupationalTest c WHERE c.preocupational_test_user = :user")}
)
public class PreocupationalTest implements Serializable {

    @Id
    private Integer preocupational_test_id;

    @ManyToOne
    @JoinColumn(name = "preocupational_test_user")
    private Users preocupational_test_user;

    private Boolean preocupational_test_asma;
    private Boolean preocupational_test_epoc;
    private Boolean preocupational_test_cardiovascular;
    private Boolean preocupational_test_diabetes;
    private Boolean preocupational_test_renal;
    private Boolean preocupational_test_inmunosupresion;
    private Boolean preocupational_test_hipertension;
    private Boolean preocupational_test_cancer;
    private Boolean preocupational_test_obesidad;
    private Boolean preocupational_test_desnutricion;
    private Boolean preocupational_test_reumatologica;
    private Boolean preocupational_test_embarazo;
    private Boolean preocupational_test_tabaquismo;
    private Boolean preocupational_test_alcoholismo;
    private Boolean preocupational_test_hepaticas;
    private Boolean preocupational_test_tos;
    private Boolean preocupational_test_dificultad_respiratoria;
    private Boolean preocupational_test_respiracion_rapida;
    private Boolean preocupational_test_dolor_garganta;
    private Boolean preocupational_test_escalofrio;
    private Boolean preocupational_test_nauseas;
    private Boolean preocupational_test_vomito;
    private Boolean preocupational_test_dolor_pecho;
    private Boolean preocupational_test_malestar_general;
    private Boolean preocupational_test_cansancio_muscular;
    private Boolean preocupational_test_diarrea;
    private Boolean preocupational_test_dolor_abdominal;
    private Boolean preocupational_test_dolor_cabeza;
    private String preocupational_test_otros_sintomas;
    private String preocupational_test_medicamentos;
    private String preocupational_test_otros_enfermedad;
    private Boolean preocupational_test_p1_boolean;
    private Boolean preocupational_test_p2_boolean;
    private Boolean preocupational_test_p3_boolean;
    private Boolean preocupational_test_p4_boolean;
    private Boolean preocupational_test_p5_boolean;
    private Boolean preocupational_test_p6_boolean;
    private Boolean preocupational_test_p7_boolean;
    private Boolean preocupational_test_p8_boolean;
    private Boolean preocupational_test_p9_boolean;
    private String preocupational_test_p1_observation;
    private String preocupational_test_p2_observation;
    private String preocupational_test_p3_observation;
    private String preocupational_test_p4_observation;
    private String preocupational_test_p5_observation;
    private String preocupational_test_p6_observation;
    private String preocupational_test_p7_observation;
    private String preocupational_test_p8_observation;
    private String preocupational_test_p9_observation;
    private String preocupational_test_p1_transport;
    private String preocupational_test_p2_transport;
    private String preocupational_test_p1_concepto_cualitativo;

    private Boolean preocupational_test_asma_antes;
    private Boolean preocupational_test_epoc_antes;
    private Boolean preocupational_test_cardiovascular_antes;
    private Boolean preocupational_test_diabetes_antes;
    private Boolean preocupational_test_renal_antes;
    private Boolean preocupational_test_inmunosupresion_antes;
    private Boolean preocupational_test_hipertension_antes;
    private Boolean preocupational_test_cancer_antes;
    private Boolean preocupational_test_obesidad_antes;
    private Boolean preocupational_test_desnutricion_antes;
    private Boolean preocupational_test_reumatologicas_antes;
    private Boolean preocupational_test_embarazo_antes;
    private Boolean preocupational_test_tabaquismo_antes;
    private Boolean preocupational_test_alcoholismo_antes;
    private Boolean preocupational_test_hepaticas_antes;
    
    
    public PreocupationalTest() {

    }

    /**
     * @return the preocupational_test_id
     */
    public Integer getPreocupational_test_id() {
        return preocupational_test_id;
    }

    /**
     * @param preocupational_test_id the preocupational_test_id to set
     */
    public void setPreocupational_test_id(Integer preocupational_test_id) {
        this.preocupational_test_id = preocupational_test_id;
    }

    /**
     * @return the preocupational_test_user
     */
    public Users getPreocupational_test_user() {
        return preocupational_test_user;
    }

    /**
     * @param preocupational_test_user the preocupational_test_user to set
     */
    public void setPreocupational_test_user(Users preocupational_test_user) {
        this.preocupational_test_user = preocupational_test_user;
    }

    /**
     * @return the preocupational_test_asma
     */
    public Boolean getPreocupational_test_asma() {
        return preocupational_test_asma;
    }

    /**
     * @param preocupational_test_asma the preocupational_test_asma to set
     */
    public void setPreocupational_test_asma(Boolean preocupational_test_asma) {
        this.preocupational_test_asma = preocupational_test_asma;
    }

    /**
     * @return the preocupational_test_epoc
     */
    public Boolean getPreocupational_test_epoc() {
        return preocupational_test_epoc;
    }

    /**
     * @param preocupational_test_epoc the preocupational_test_epoc to set
     */
    public void setPreocupational_test_epoc(Boolean preocupational_test_epoc) {
        this.preocupational_test_epoc = preocupational_test_epoc;
    }

    /**
     * @return the preocupational_test_cardiovascular
     */
    public Boolean getPreocupational_test_cardiovascular() {
        return preocupational_test_cardiovascular;
    }

    /**
     * @param preocupational_test_cardiovascular the
     * preocupational_test_cardiovascular to set
     */
    public void setPreocupational_test_cardiovascular(Boolean preocupational_test_cardiovascular) {
        this.preocupational_test_cardiovascular = preocupational_test_cardiovascular;
    }

    /**
     * @return the preocupational_test_diabetes
     */
    public Boolean getPreocupational_test_diabetes() {
        return preocupational_test_diabetes;
    }

    /**
     * @param preocupational_test_diabetes the preocupational_test_diabetes to
     * set
     */
    public void setPreocupational_test_diabetes(Boolean preocupational_test_diabetes) {
        this.preocupational_test_diabetes = preocupational_test_diabetes;
    }

    /**
     * @return the preocupational_test_renal
     */
    public Boolean getPreocupational_test_renal() {
        return preocupational_test_renal;
    }

    /**
     * @param preocupational_test_renal the preocupational_test_renal to set
     */
    public void setPreocupational_test_renal(Boolean preocupational_test_renal) {
        this.preocupational_test_renal = preocupational_test_renal;
    }

    /**
     * @return the preocupational_test_inmunosupresion
     */
    public Boolean getPreocupational_test_inmunopresion() {
        return preocupational_test_inmunosupresion;
    }

    /**
     * @param preocupational_test_inmunosupresion the
     * preocupational_test_inmunopresion to set
     */
    public void setPreocupational_test_inmunopresion(Boolean preocupational_test_inmunosupresion) {
        this.preocupational_test_inmunosupresion = preocupational_test_inmunosupresion;
    }

    /**
     * @return the preocupational_test_hipertension
     */
    public Boolean getPreocupational_test_hipertension() {
        return preocupational_test_hipertension;
    }

    /**
     * @param preocupational_test_hipertension the
     * preocupational_test_hipertension to set
     */
    public void setPreocupational_test_hipertension(Boolean preocupational_test_hipertension) {
        this.preocupational_test_hipertension = preocupational_test_hipertension;
    }

    /**
     * @return the preocupational_test_cancer
     */
    public Boolean getPreocupational_test_cancer() {
        return preocupational_test_cancer;
    }

    /**
     * @param preocupational_test_cancer the preocupational_test_cancer to set
     */
    public void setPreocupational_test_cancer(Boolean preocupational_test_cancer) {
        this.preocupational_test_cancer = preocupational_test_cancer;
    }

    /**
     * @return the preocupational_test_obesidad
     */
    public Boolean getPreocupational_test_obesidad() {
        return preocupational_test_obesidad;
    }

    /**
     * @param preocupational_test_obesidad the preocupational_test_obesidad to
     * set
     */
    public void setPreocupational_test_obesidad(Boolean preocupational_test_obesidad) {
        this.preocupational_test_obesidad = preocupational_test_obesidad;
    }

    /**
     * @return the preocupational_test_desnutricion
     */
    public Boolean getPreocupational_test_desnutricion() {
        return preocupational_test_desnutricion;
    }

    /**
     * @param preocupational_test_desnutricion the
     * preocupational_test_desnutricion to set
     */
    public void setPreocupational_test_desnutricion(Boolean preocupational_test_desnutricion) {
        this.preocupational_test_desnutricion = preocupational_test_desnutricion;
    }

    /**
     * @return the preocupational_test_reumatologica
     */
    public Boolean getPreocupational_test_reumatologica() {
        return preocupational_test_reumatologica;
    }

    /**
     * @param preocupational_test_reumatologica the
     * preocupational_test_reumatologica to set
     */
    public void setPreocupational_test_reumatologica(Boolean preocupational_test_reumatologica) {
        this.preocupational_test_reumatologica = preocupational_test_reumatologica;
    }

    /**
     * @return the preocupational_test_embarazo
     */
    public Boolean getPreocupational_test_embarazo() {
        return preocupational_test_embarazo;
    }

    /**
     * @param preocupational_test_embarazo the preocupational_test_embarazo to
     * set
     */
    public void setPreocupational_test_embarazo(Boolean preocupational_test_embarazo) {
        this.preocupational_test_embarazo = preocupational_test_embarazo;
    }

    /**
     * @return the preocupational_test_tabaquismo
     */
    public Boolean getPreocupational_test_tabaquismo() {
        return preocupational_test_tabaquismo;
    }

    /**
     * @param preocupational_test_tabaquismo the preocupational_test_tabaquismo
     * to set
     */
    public void setPreocupational_test_tabaquismo(Boolean preocupational_test_tabaquismo) {
        this.preocupational_test_tabaquismo = preocupational_test_tabaquismo;
    }

    /**
     * @return the preocupational_test_alcoholismo
     */
    public Boolean getPreocupational_test_alcoholismo() {
        return preocupational_test_alcoholismo;
    }

    /**
     * @param preocupational_test_alcoholismo the
     * preocupational_test_alcoholismo to set
     */
    public void setPreocupational_test_alcoholismo(Boolean preocupational_test_alcoholismo) {
        this.preocupational_test_alcoholismo = preocupational_test_alcoholismo;
    }

    /**
     * @return the preocupational_test_hepaticas
     */
    public Boolean getPreocupational_test_hepaticas() {
        return preocupational_test_hepaticas;
    }

    /**
     * @param preocupational_test_hepaticas the preocupational_test_hepaticas to
     * set
     */
    public void setPreocupational_test_hepaticas(Boolean preocupational_test_hepaticas) {
        this.preocupational_test_hepaticas = preocupational_test_hepaticas;
    }

    /**
     * @return the preocupational_test_tos
     */
    public Boolean getPreocupational_test_tos() {
        return preocupational_test_tos;
    }

    /**
     * @param preocupational_test_tos the preocupational_test_tos to set
     */
    public void setPreocupational_test_tos(Boolean preocupational_test_tos) {
        this.preocupational_test_tos = preocupational_test_tos;
    }

    /**
     * @return the preocupational_test_dificultad_respiratoria
     */
    public Boolean getPreocupational_test_dificultad_respiratoria() {
        return preocupational_test_dificultad_respiratoria;
    }

    /**
     * @param preocupational_test_dificultad_respiratoria the
     * preocupational_test_dificultad_respiratoria to set
     */
    public void setPreocupational_test_dificultad_respiratoria(Boolean preocupational_test_dificultad_respiratoria) {
        this.preocupational_test_dificultad_respiratoria = preocupational_test_dificultad_respiratoria;
    }

    /**
     * @return the preocupational_test_respiracion_rapida
     */
    public Boolean getPreocupational_test_respiracion_rapida() {
        return preocupational_test_respiracion_rapida;
    }

    /**
     * @param preocupational_test_respiracion_rapida the
     * preocupational_test_respiracion_rapida to set
     */
    public void setPreocupational_test_respiracion_rapida(Boolean preocupational_test_respiracion_rapida) {
        this.preocupational_test_respiracion_rapida = preocupational_test_respiracion_rapida;
    }

    /**
     * @return the preocupational_test_dolor_garganta
     */
    public Boolean getPreocupational_test_dolor_garganta() {
        return preocupational_test_dolor_garganta;
    }

    /**
     * @param preocupational_test_dolor_garganta the
     * preocupational_test_dolor_garganta to set
     */
    public void setPreocupational_test_dolor_garganta(Boolean preocupational_test_dolor_garganta) {
        this.preocupational_test_dolor_garganta = preocupational_test_dolor_garganta;
    }

    /**
     * @return the preocupational_test_escalofrio
     */
    public Boolean getPreocupational_test_escalofrio() {
        return preocupational_test_escalofrio;
    }

    /**
     * @param preocupational_test_escalofrio the preocupational_test_escalofrio
     * to set
     */
    public void setPreocupational_test_escalofrio(Boolean preocupational_test_escalofrio) {
        this.preocupational_test_escalofrio = preocupational_test_escalofrio;
    }

    /**
     * @return the preocupational_test_nauseas
     */
    public Boolean getPreocupational_test_nauseas() {
        return preocupational_test_nauseas;
    }

    /**
     * @param preocupational_test_nauseas the preocupational_test_nauseas to set
     */
    public void setPreocupational_test_nauseas(Boolean preocupational_test_nauseas) {
        this.preocupational_test_nauseas = preocupational_test_nauseas;
    }

    /**
     * @return the preocupational_test_vomito
     */
    public Boolean getPreocupational_test_vomito() {
        return preocupational_test_vomito;
    }

    /**
     * @param preocupational_test_vomito the preocupational_test_vomito to set
     */
    public void setPreocupational_test_vomito(Boolean preocupational_test_vomito) {
        this.preocupational_test_vomito = preocupational_test_vomito;
    }

    /**
     * @return the preocupational_test_dolor_pecho
     */
    public Boolean getPreocupational_test_dolor_pecho() {
        return preocupational_test_dolor_pecho;
    }

    /**
     * @param preocupational_test_dolor_pecho the
     * preocupational_test_dolor_pecho to set
     */
    public void setPreocupational_test_dolor_pecho(Boolean preocupational_test_dolor_pecho) {
        this.preocupational_test_dolor_pecho = preocupational_test_dolor_pecho;
    }

    /**
     * @return the preocupational_test_malestar_general
     */
    public Boolean getPreocupational_test_malestar_general() {
        return preocupational_test_malestar_general;
    }

    /**
     * @param preocupational_test_malestar_general the
     * preocupational_test_malestar_general to set
     */
    public void setPreocupational_test_malestar_general(Boolean preocupational_test_malestar_general) {
        this.preocupational_test_malestar_general = preocupational_test_malestar_general;
    }

    /**
     * @return the preocupational_test_cansancio_muscular
     */
    public Boolean getPreocupational_test_cansancio_muscular() {
        return preocupational_test_cansancio_muscular;
    }

    /**
     * @param preocupational_test_cansancio_muscular the
     * preocupational_test_cansancio_muscular to set
     */
    public void setPreocupational_test_cansancio_muscular(Boolean preocupational_test_cansancio_muscular) {
        this.preocupational_test_cansancio_muscular = preocupational_test_cansancio_muscular;
    }

    /**
     * @return the preocupational_test_diarrea
     */
    public Boolean getPreocupational_test_diarrea() {
        return preocupational_test_diarrea;
    }

    /**
     * @param preocupational_test_diarrea the preocupational_test_diarrea to set
     */
    public void setPreocupational_test_diarrea(Boolean preocupational_test_diarrea) {
        this.preocupational_test_diarrea = preocupational_test_diarrea;
    }

    /**
     * @return the preocupational_test_dolor_abdominal
     */
    public Boolean getPreocupational_test_dolor_abdominal() {
        return preocupational_test_dolor_abdominal;
    }

    /**
     * @param preocupational_test_dolor_abdominal the
     * preocupational_test_dolor_abdominal to set
     */
    public void setPreocupational_test_dolor_abdominal(Boolean preocupational_test_dolor_abdominal) {
        this.preocupational_test_dolor_abdominal = preocupational_test_dolor_abdominal;
    }

    /**
     * @return the preocupational_test_dolor_cabeza
     */
    public Boolean getPreocupational_test_dolor_cabeza() {
        return preocupational_test_dolor_cabeza;
    }

    /**
     * @param preocupational_test_dolor_cabeza the
     * preocupational_test_dolor_cabeza to set
     */
    public void setPreocupational_test_dolor_cabeza(Boolean preocupational_test_dolor_cabeza) {
        this.preocupational_test_dolor_cabeza = preocupational_test_dolor_cabeza;
    }

    /**
     * @return the preocupational_test_otros
     */
    public String getPreocupational_test_otros_sintomas() {
        return preocupational_test_otros_sintomas;
    }

    /**
     * @param preocupational_test_otros_sintomas the
     * preocupational_test_otros_sintomas to set
     */
    public void setPreocupational_test_otros_sintomas(String preocupational_test_otros_sintomas) {
        this.preocupational_test_otros_sintomas = preocupational_test_otros_sintomas;
    }

    /**
     * @return the preocupational_test_medicamentos
     */
    public String getPreocupational_test_medicamentos() {
        return preocupational_test_medicamentos;
    }

    /**
     * @param preocupational_test_medicamentos the
     * preocupational_test_medicamentos to set
     */
    public void setPreocupational_test_medicamentos(String preocupational_test_medicamentos) {
        this.preocupational_test_medicamentos = preocupational_test_medicamentos;
    }

    /**
     * @return the preocupational_test_otros_enfermedad
     */
    public String getPreocupational_test_otros_enfermedad() {
        return preocupational_test_otros_enfermedad;
    }

    /**
     * @param preocupational_test_otros_enfermedad the
     * preocupational_test_otros_enfermedades to set
     */
    public void setPreocupational_test_otros_enfermedad(String preocupational_test_otros_enfermedad) {
        this.preocupational_test_otros_enfermedad = preocupational_test_otros_enfermedad;
    }

    /**
     * @return the preocupational_test_p1_boolean
     */
    public Boolean getPreocupational_test_p1_boolean() {
        return preocupational_test_p1_boolean;
    }

    /**
     * @param preocupational_test_p1_boolean the preocupational_test_p1_boolean
     * to set
     */
    public void setPreocupational_test_p1_boolean(Boolean preocupational_test_p1_boolean) {
        this.preocupational_test_p1_boolean = preocupational_test_p1_boolean;
    }

    /**
     * @return the preocupational_test_p2_boolean
     */
    public Boolean getPreocupational_test_p2_boolean() {
        return preocupational_test_p2_boolean;
    }

    /**
     * @param preocupational_test_p2_boolean the preocupational_test_p2_boolean
     * to set
     */
    public void setPreocupational_test_p2_boolean(Boolean preocupational_test_p2_boolean) {
        this.preocupational_test_p2_boolean = preocupational_test_p2_boolean;
    }

    /**
     * @return the preocupational_test_p3_boolean
     */
    public Boolean getPreocupational_test_p3_boolean() {
        return preocupational_test_p3_boolean;
    }

    /**
     * @param preocupational_test_p3_boolean the preocupational_test_p3_boolean
     * to set
     */
    public void setPreocupational_test_p3_boolean(Boolean preocupational_test_p3_boolean) {
        this.preocupational_test_p3_boolean = preocupational_test_p3_boolean;
    }

    /**
     * @return the preocupational_test_p4_boolean
     */
    public Boolean getPreocupational_test_p4_boolean() {
        return preocupational_test_p4_boolean;
    }

    /**
     * @param preocupational_test_p4_boolean the preocupational_test_p4_boolean
     * to set
     */
    public void setPreocupational_test_p4_boolean(Boolean preocupational_test_p4_boolean) {
        this.preocupational_test_p4_boolean = preocupational_test_p4_boolean;
    }

    /**
     * @return the preocupational_test_p5_boolean
     */
    public Boolean getPreocupational_test_p5_boolean() {
        return preocupational_test_p5_boolean;
    }

    /**
     * @param preocupational_test_p5_boolean the preocupational_test_p5_boolean
     * to set
     */
    public void setPreocupational_test_p5_boolean(Boolean preocupational_test_p5_boolean) {
        this.preocupational_test_p5_boolean = preocupational_test_p5_boolean;
    }

    /**
     * @return the preocupational_test_p6_boolean
     */
    public Boolean getPreocupational_test_p6_boolean() {
        return preocupational_test_p6_boolean;
    }

    /**
     * @param preocupational_test_p6_boolean the preocupational_test_p6_boolean
     * to set
     */
    public void setPreocupational_test_p6_boolean(Boolean preocupational_test_p6_boolean) {
        this.preocupational_test_p6_boolean = preocupational_test_p6_boolean;
    }

    /**
     * @return the preocupational_test_p7_boolean
     */
    public Boolean getPreocupational_test_p7_boolean() {
        return preocupational_test_p7_boolean;
    }

    /**
     * @param preocupational_test_p7_boolean the preocupational_test_p7_boolean
     * to set
     */
    public void setPreocupational_test_p7_boolean(Boolean preocupational_test_p7_boolean) {
        this.preocupational_test_p7_boolean = preocupational_test_p7_boolean;
    }

    /**
     * @return the preocupational_test_p8_boolean
     */
    public Boolean getPreocupational_test_p8_boolean() {
        return preocupational_test_p8_boolean;
    }

    /**
     * @param preocupational_test_p8_boolean the preocupational_test_p8_boolean
     * to set
     */
    public void setPreocupational_test_p8_boolean(Boolean preocupational_test_p8_boolean) {
        this.preocupational_test_p8_boolean = preocupational_test_p8_boolean;
    }

    /**
     * @return the preocupational_test_p9_boolean
     */
    public Boolean getPreocupational_test_p9_boolean() {
        return preocupational_test_p9_boolean;
    }

    /**
     * @param preocupational_test_p9_boolean the preocupational_test_p9_boolean
     * to set
     */
    public void setPreocupational_test_p9_boolean(Boolean preocupational_test_p9_boolean) {
        this.preocupational_test_p9_boolean = preocupational_test_p9_boolean;
    }

    /**
     * @return the preocupational_test_p1_observation
     */
    public String getPreocupational_test_p1_observation() {
        return preocupational_test_p1_observation;
    }

    /**
     * @param preocupational_test_p1_observation the
     * preocupational_test_p1_observation to set
     */
    public void setPreocupational_test_p1_observation(String preocupational_test_p1_observation) {
        this.preocupational_test_p1_observation = preocupational_test_p1_observation;
    }

    /**
     * @return the preocupational_test_p2_observation
     */
    public String getPreocupational_test_p2_observation() {
        return preocupational_test_p2_observation;
    }

    /**
     * @param preocupational_test_p2_observation the
     * preocupational_test_p2_observation to set
     */
    public void setPreocupational_test_p2_observation(String preocupational_test_p2_observation) {
        this.preocupational_test_p2_observation = preocupational_test_p2_observation;
    }

    /**
     * @return the preocupational_test_p3_observation
     */
    public String getPreocupational_test_p3_observation() {
        return preocupational_test_p3_observation;
    }

    /**
     * @param preocupational_test_p3_observation the
     * preocupational_test_p3_observation to set
     */
    public void setPreocupational_test_p3_observation(String preocupational_test_p3_observation) {
        this.preocupational_test_p3_observation = preocupational_test_p3_observation;
    }

    /**
     * @return the preocupational_test_p4_observation
     */
    public String getPreocupational_test_p4_observation() {
        return preocupational_test_p4_observation;
    }

    /**
     * @param preocupational_test_p4_observation the
     * preocupational_test_p4_observation to set
     */
    public void setPreocupational_test_p4_observation(String preocupational_test_p4_observation) {
        this.preocupational_test_p4_observation = preocupational_test_p4_observation;
    }

    /**
     * @return the preocupational_test_p5_observation
     */
    public String getPreocupational_test_p5_observation() {
        return preocupational_test_p5_observation;
    }

    /**
     * @param preocupational_test_p5_observation the
     * preocupational_test_p5_observation to set
     */
    public void setPreocupational_test_p5_observation(String preocupational_test_p5_observation) {
        this.preocupational_test_p5_observation = preocupational_test_p5_observation;
    }

    /**
     * @return the preocupational_test_p6_observation
     */
    public String getPreocupational_test_p6_observation() {
        return preocupational_test_p6_observation;
    }

    /**
     * @param preocupational_test_p6_observation the
     * preocupational_test_p6_observation to set
     */
    public void setPreocupational_test_p6_observation(String preocupational_test_p6_observation) {
        this.preocupational_test_p6_observation = preocupational_test_p6_observation;
    }

    /**
     * @return the preocupational_test_p7_observation
     */
    public String getPreocupational_test_p7_observation() {
        return preocupational_test_p7_observation;
    }

    /**
     * @param preocupational_test_p7_observation the
     * preocupational_test_p7_observation to set
     */
    public void setPreocupational_test_p7_observation(String preocupational_test_p7_observation) {
        this.preocupational_test_p7_observation = preocupational_test_p7_observation;
    }

    /**
     * @return the preocupational_test_p8_observation
     */
    public String getPreocupational_test_p8_observation() {
        return preocupational_test_p8_observation;
    }

    /**
     * @param preocupational_test_p8_observation the
     * preocupational_test_p8_observation to set
     */
    public void setPreocupational_test_p8_observation(String preocupational_test_p8_observation) {
        this.preocupational_test_p8_observation = preocupational_test_p8_observation;
    }

    /**
     * @return the preocupational_test_p9_observation
     */
    public String getPreocupational_test_p9_observation() {
        return preocupational_test_p9_observation;
    }

    /**
     * @param preocupational_test_p9_observation the
     * preocupational_test_p9_observation to set
     */
    public void setPreocupational_test_p9_observation(String preocupational_test_p9_observation) {
        this.preocupational_test_p9_observation = preocupational_test_p9_observation;
    }

    /**
     * @return the preocupational_test_p1_transport
     */
    public String getPreocupational_test_p1_transport() {
        return preocupational_test_p1_transport;
    }

    /**
     * @param preocupational_test_p1_transport the
     * preocupational_test_p1_transport to set
     */
    public void setPreocupational_test_p1_transport(String preocupational_test_p1_transport) {
        this.preocupational_test_p1_transport = preocupational_test_p1_transport;
    }

    /**
     * @return the preocupational_test_p2_transport
     */
    public String getPreocupational_test_p2_transport() {
        return preocupational_test_p2_transport;
    }

    /**
     * @param preocupational_test_p2_transport the
     * preocupational_test_p2_transport to set
     */
    public void setPreocupational_test_p2_transport(String preocupational_test_p2_transport) {
        this.preocupational_test_p2_transport = preocupational_test_p2_transport;
    }

    /**
     * @return the preocupational_test_p1_concepto_cualitativo
     */
    public String getPreocupational_test_p1_concepto_cualitativo() {
        return preocupational_test_p1_concepto_cualitativo;
    }

    /**
     * @param preocupational_test_p1_concepto_cualitativo the
     * preocupational_test_p1_concepto_cualitativo to set
     */
    public void setPreocupational_test_p1_concepto_cualitativo(String preocupational_test_p1_concepto_cualitativo) {
        this.preocupational_test_p1_concepto_cualitativo = preocupational_test_p1_concepto_cualitativo;
    }

    /**
     * @return the preocupational_test_asma_antes
     */
    public Boolean getPreocupational_test_asma_antes() {
        return preocupational_test_asma_antes;
    }

    /**
     * @param preocupational_test_asma_antes the preocupational_test_asma_antes to set
     */
    public void setPreocupational_test_asma_antes(Boolean preocupational_test_asma_antes) {
        this.preocupational_test_asma_antes = preocupational_test_asma_antes;
    }

    /**
     * @return the preocupational_test_epoc_antes
     */
    public Boolean getPreocupational_test_epoc_antes() {
        return preocupational_test_epoc_antes;
    }

    /**
     * @param preocupational_test_epoc_antes the preocupational_test_epoc_antes to set
     */
    public void setPreocupational_test_epoc_antes(Boolean preocupational_test_epoc_antes) {
        this.preocupational_test_epoc_antes = preocupational_test_epoc_antes;
    }

    /**
     * @return the preocupational_test_cardiovascular_antes
     */
    public Boolean getPreocupational_test_cardiovascular_antes() {
        return preocupational_test_cardiovascular_antes;
    }

    /**
     * @param preocupational_test_cardiovascular_antes the preocupational_test_cardiovascular_antes to set
     */
    public void setPreocupational_test_cardiovascular_antes(Boolean preocupational_test_cardiovascular_antes) {
        this.preocupational_test_cardiovascular_antes = preocupational_test_cardiovascular_antes;
    }

    /**
     * @return the preocupational_test_diabetes_antes
     */
    public Boolean getPreocupational_test_diabetes_antes() {
        return preocupational_test_diabetes_antes;
    }

    /**
     * @param preocupational_test_diabetes_antes the preocupational_test_diabetes_antes to set
     */
    public void setPreocupational_test_diabetes_antes(Boolean preocupational_test_diabetes_antes) {
        this.preocupational_test_diabetes_antes = preocupational_test_diabetes_antes;
    }

    /**
     * @return the preocupational_test_renal_antes
     */
    public Boolean getPreocupational_test_renal_antes() {
        return preocupational_test_renal_antes;
    }

    /**
     * @param preocupational_test_renal_antes the preocupational_test_renal_antes to set
     */
    public void setPreocupational_test_renal_antes(Boolean preocupational_test_renal_antes) {
        this.preocupational_test_renal_antes = preocupational_test_renal_antes;
    }

    /**
     * @return the preocupational_test_inmunosupresion_antes
     */
    public Boolean getPreocupational_test_inmunosupresion_antes() {
        return preocupational_test_inmunosupresion_antes;
    }

    /**
     * @param preocupational_test_inmunosupresion_antes the preocupational_test_inmunosupresion_antes to set
     */
    public void setPreocupational_test_inmunosupresion_antes(Boolean preocupational_test_inmunosupresion_antes) {
        this.preocupational_test_inmunosupresion_antes = preocupational_test_inmunosupresion_antes;
    }

    /**
     * @return the preocupational_test_hipertension_antes
     */
    public Boolean getPreocupational_test_hipertension_antes() {
        return preocupational_test_hipertension_antes;
    }

    /**
     * @param preocupational_test_hipertension_antes the preocupational_test_hipertension_antes to set
     */
    public void setPreocupational_test_hipertension_antes(Boolean preocupational_test_hipertension_antes) {
        this.preocupational_test_hipertension_antes = preocupational_test_hipertension_antes;
    }

    /**
     * @return the preocupational_test_cancer_antes
     */
    public Boolean getPreocupational_test_cancer_antes() {
        return preocupational_test_cancer_antes;
    }

    /**
     * @param preocupational_test_cancer_antes the preocupational_test_cancer_antes to set
     */
    public void setPreocupational_test_cancer_antes(Boolean preocupational_test_cancer_antes) {
        this.preocupational_test_cancer_antes = preocupational_test_cancer_antes;
    }

    /**
     * @return the preocupational_test_obesidad_antes
     */
    public Boolean getPreocupational_test_obesidad_antes() {
        return preocupational_test_obesidad_antes;
    }

    /**
     * @param preocupational_test_obesidad_antes the preocupational_test_obesidad_antes to set
     */
    public void setPreocupational_test_obesidad_antes(Boolean preocupational_test_obesidad_antes) {
        this.preocupational_test_obesidad_antes = preocupational_test_obesidad_antes;
    }

    /**
     * @return the preocupational_test_desnutricion_antes
     */
    public Boolean getPreocupational_test_desnutricion_antes() {
        return preocupational_test_desnutricion_antes;
    }

    /**
     * @param preocupational_test_desnutricion_antes the preocupational_test_desnutricion_antes to set
     */
    public void setPreocupational_test_desnutricion_antes(Boolean preocupational_test_desnutricion_antes) {
        this.preocupational_test_desnutricion_antes = preocupational_test_desnutricion_antes;
    }

    /**
     * @return the preocupational_test_reumatologicas_antes
     */
    public Boolean getPreocupational_test_reumatologicas_antes() {
        return preocupational_test_reumatologicas_antes;
    }

    /**
     * @param preocupational_test_reumatologicas_antes the preocupational_test_reumatologica_antes to set
     */
    public void setPreocupational_test_reumatologicas_antes(Boolean preocupational_test_reumatologicas_antes) {
        this.preocupational_test_reumatologicas_antes = preocupational_test_reumatologicas_antes;
    }

    /**
     * @return the preocupational_test_embarazo_antes
     */
    public Boolean getPreocupational_test_embarazo_antes() {
        return preocupational_test_embarazo_antes;
    }

    /**
     * @param preocupational_test_embarazo_antes the preocupational_test_embarazo_antes to set
     */
    public void setPreocupational_test_embarazo_antes(Boolean preocupational_test_embarazo_antes) {
        this.preocupational_test_embarazo_antes = preocupational_test_embarazo_antes;
    }

    /**
     * @return the preocupational_test_tabaquismo_antes
     */
    public Boolean getPreocupational_test_tabaquismo_antes() {
        return preocupational_test_tabaquismo_antes;
    }

    /**
     * @param preocupational_test_tabaquismo_antes the preocupational_test_tabaquismo_antes to set
     */
    public void setPreocupational_test_tabaquismo_antes(Boolean preocupational_test_tabaquismo_antes) {
        this.preocupational_test_tabaquismo_antes = preocupational_test_tabaquismo_antes;
    }

    /**
     * @return the preocupational_test_alcoholismo_antes
     */
    public Boolean getPreocupational_test_alcoholismo_antes() {
        return preocupational_test_alcoholismo_antes;
    }

    /**
     * @param preocupational_test_alcoholismo_antes the preocupational_test_alcoholismo_antes to set
     */
    public void setPreocupational_test_alcoholismo_antes(Boolean preocupational_test_alcoholismo_antes) {
        this.preocupational_test_alcoholismo_antes = preocupational_test_alcoholismo_antes;
    }

    /**
     * @return the preocupational_test_hepaticas_antes
     */
    public Boolean getPreocupational_test_hepaticas_antes() {
        return preocupational_test_hepaticas_antes;
    }

    /**
     * @param preocupational_test_hepaticas_antes the preocupational_test_hepaticas_antes to set
     */
    public void setPreocupational_test_hepaticas_antes(Boolean preocupational_test_hepaticas_antes) {
        this.preocupational_test_hepaticas_antes = preocupational_test_hepaticas_antes;
    }
}
