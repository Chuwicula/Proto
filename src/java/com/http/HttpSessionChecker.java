/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.http;

import java.util.Date;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 *
 * @author linuxserver
 */
@WebListener
public class HttpSessionChecker implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent event) {
        System.out.printf("Session ID %s created at %s%n", event.getSession().getId(), new Date());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent event) {
        System.out.printf("Session ID %s destroyed at %s%n", event.getSession().getId(), new Date());
    }

}
