/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.internal_contact;

import DAO.EntityManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;

/**
 *
 * @author ncabrejo
 */
@Stateless
public class InternalContactFadace {

    private final EntityManager em = EntityManager.getInstance("/hibernate.cfg.xml");

    public boolean updateInternalContact(InternalContact internalContact) {
        try {
            try {
                return em.save2(internalContact, "InternalContact");
            } catch (Exception ex) {
                Logger.getLogger(InternalContactFadace.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        } catch (Exception ex) {
            Logger.getLogger(InternalContactFadace.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean SaveInternalContact(InternalContact internalContact) {
        try {
            Integer id = (Integer) em.selectNameQueryUniqueResult("getIdIC");
            try {
                internalContact.setInternal_contact_id(id);
                return em.save2(internalContact, "InternalContact");
            } catch (Exception ex) {
                Logger.getLogger(InternalContactFadace.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        } catch (Exception ex) {
            Logger.getLogger(InternalContactFadace.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean DeleteInternalContact(InternalContact internalContact) {
        try {
            return em.delete(internalContact);
        } catch (Exception ex) {
            Logger.getLogger(InternalContactFadace.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
