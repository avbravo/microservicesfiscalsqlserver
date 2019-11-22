/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.microservicesfiscalsqlserver.provider;


import com.avbravo.jmoordbutils.JsfUtil;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Singleton;

/**
 *
 * @author avbravo
 */
@Singleton
@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER)
public class SQLServerProducer {
 Connection connectionClient=null;
    @Produces
    @ApplicationScoped
    public Connection connection() {
      
        try {
             if( connectionClient==null){
                   Class.forName("net.sourceforge.jtds.jdbc.Driver");
            connectionClient = connectionClient = DriverManager.getConnection("jdbc:jtds:sqlserver://localhost:1433/GRUPOMORENO;instance=SQLEXPRESS;", "sa", "controljav180denver$");
               
             }
            
        } catch (Exception e) {
            JsfUtil.errorMessage("conecction() "+e.getLocalizedMessage());
        }

        return connectionClient;
    }
}
