/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beansForTest;

import contentcontroller.ContentController;
import entidades.areas.Areas;
import entidades.home_people.HomePeople;
import entidades.home_people.HomePeopleFacade;
import entidades.preocupational_test.PreocupationalFacade;
import entidades.preocupational_test.PreocupationalTest;
import entidades.users.UserFacade;
import entidades.users.Users;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import util.Utilidades;

/**
 *
 * @author ncabrejo
 */
@ViewScoped
@ManagedBean(name = "PreocupationalBean")
public class PreocupationalBean implements Serializable {

    private PreocupationalTest preocupationalTest;

    private Integer areaSelect;

    @ManagedProperty("#{constantesBean}")
    private constantes.ConstantesBean constantesBean;
    @ManagedProperty("#{contentController}")
    private ContentController contentController;
    
    @EJB
    UserFacade userFacade;
    @EJB
    PreocupationalFacade preocupationalFacade;
    @EJB
    HomePeopleFacade homePeopleFacade;

    @PostConstruct
    public void init() {
        System.out.println("Preocupaional creado");
        setPreocupationalTest(new PreocupationalTest());
    }

    public void guardarInfor(Users user) {

        if (user.getPreocupationalTests() == null) {
            user.setPreocupationalTests(new ArrayList<>());
        }

        for (Areas ar : constantesBean.getAreas()) {
            if (Objects.equals(ar.getArea_id(), areaSelect)) {
                user.setArea_id(ar);
                System.out.println("Area" + ar.getArea_nombre());
            }
        }

        preocupationalTest.setPreocupational_test_user(user);
        preocupationalFacade.savePreocupational(preocupationalTest);

        user.getPreocupationalTests().add(preocupationalTest);

        if (userFacade.saveUser(user)) {
            contentController.setIsPreoupationalReady(true);
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage("Successful", "Datos Guardados"));
            //Utilidades.imprimir_msg("Bien!", "Datos Guardados");
        } else {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage("Error", "Datos No Guardados"));
            //Utilidades.imprimir_msg("Error!", "Inconsistencia al guardar");
        }

    }

    /**
     * @return the preocupationalTest
     */
    public PreocupationalTest getPreocupationalTest() {
        return preocupationalTest;
    }

    /**
     * @param preocupationalTest the preocupationalTest to set
     */
    public void setPreocupationalTest(PreocupationalTest preocupationalTest) {
        this.preocupationalTest = preocupationalTest;
    }

    /**
     * @return the areaSelect
     */
    public Integer getAreaSelect() {
        return areaSelect;
    }

    /**
     * @param areaSelect the areaSelect to set
     */
    public void setAreaSelect(Integer areaSelect) {
        this.areaSelect = areaSelect;
    }

    /**
     * @return the constantesBean
     */
    public constantes.ConstantesBean getConstantesBean() {
        return constantesBean;
    }

    /**
     * @param constantesBean the constantesBean to set
     */
    public void setConstantesBean(constantes.ConstantesBean constantesBean) {
        this.constantesBean = constantesBean;
    }

    /**
     * @return the contentController
     */
    public ContentController getContentController() {
        return contentController;
    }

    /**
     * @param contentController the contentController to set
     */
    public void setContentController(ContentController contentController) {
        this.contentController = contentController;
    }

}
