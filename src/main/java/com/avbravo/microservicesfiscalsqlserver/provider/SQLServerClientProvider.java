/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.microservicesfiscalsqlserver.provider;

/**
 *
 * @author avbravo
 */

import com.avbravo.jmoordbutils.JsfUtil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;

/**
 * * * @author
 */
@Singleton
@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER)
public class SQLServerClientProvider {

    private static final Logger LOG = Logger.getLogger(SQLServerClientProvider.class.getName());

  private  Connection connectionClient = null;

    @Lock(LockType.READ)
    public Connection getConnectionClient() {
        if (connectionClient == null) {
            init();
        }
        return connectionClient;
    }
    
    @PostConstruct
    public void init() {
        try {
            
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            connectionClient = DriverManager.getConnection("jdbc:jtds:sqlserver://localhost:1433/GRUPOMORENO;instance=SQLEXPRESS;", "sa", "12345aA-bB");
        } catch (Exception e) {
            JsfUtil.errorMessage("init() " + e.getLocalizedMessage());
            LOG.warning("MongoClientStoreejbProvider init() " + e.getLocalizedMessage());
        }
    }
}
