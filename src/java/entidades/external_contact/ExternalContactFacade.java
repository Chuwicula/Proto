/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.external_contact;

import DAO.EntityManager;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;

/**
 *
 *
 * @author ncabrejo
 */
@Stateless
public class ExternalContactFacade {

    private final EntityManager em = EntityManager.getInstance("/hibernate.cfg.xml");

    public boolean updateExternalContact(ExternalContact externalContact) {
        try {
            try {
                return em.save2(externalContact, "ExternalContact");
            } catch (Exception ex) {
                Logger.getLogger(ExternalContactFacade.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        } catch (Exception ex) {
            Logger.getLogger(ExternalContactFacade.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean SaveExternalContact(ExternalContact externalContact) {
        try {
            Integer id = (Integer) em.selectNameQueryUniqueResult("getIdEC");
            try {
                externalContact.setExternal_contact_id(id);
                return em.save2(externalContact, "ExternalContact");
            } catch (Exception ex) {
                Logger.getLogger(ExternalContactFacade.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        } catch (Exception ex) {
            Logger.getLogger(ExternalContactFacade.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean DeleteExternalContact(ExternalContact externalContact) {
        try {
            return em.delete(externalContact);
        } catch (Exception ex) {
            Logger.getLogger(ExternalContactFacade.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
