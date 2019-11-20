/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.sqlserverapi;
// <editor-fold defaultstate="collapsed" desc="import">


import com.avbravo.jmoordbutils.JsfUtil;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
// </editor-fold>

/**
 *
 * @author avbravo
 * @param <T>
 */
public abstract class Repository<T> implements InterfaceRepository {
// <editor-fold defaultstate="collapsed" desc="field">
//invoca el @JmoordbProducer que tiene un metodo MongoClient mongoClient

    @Inject
    Connection connectionClient;

    Integer contador = 0;
    String database;

    Exception exception;

    // </editor-fold>
//MongoDatabase db_;
// <editor-fold defaultstate="collapsed" desc="get/set">

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    // </editor-fold>
    
    
    
        // <editor-fold defaultstate="collapsed" desc="Repository(Class<T> entityClass, Boolean.. lazy)">

    /**
     * toma el nombre de la base de datos de la configuracion inicial toma el
     * nombre de la coleccion en base al nombre del entity
     *
     * @param entityClass
     * @param lazy
     */
    public Repository(Class<T> entityClass,String database) {
     
            
        this.database = database;
      

     

    }// </editor-fold>
    
    
    
// <editor-fold defaultstate="collapsed" desc="getMongoDatabase()">
    @Override
    public Statement getStatement() {
        try {
            Statement sta = connectionClient.createStatement();

            if (sta == null) {
                //Test.msg("+++AbstractFacade.getMonogDatabase() == null");
            } else {
                //Test.msg("+++AbstractFacade.getMonogDatabase() != null");
            }
            return sta;
        } catch (Exception ex) {
            Logger.getLogger(Repository.class.getName()).log(Level.SEVERE, null, ex);

            exception = new Exception("getStatement() " + ex.getLocalizedMessage());
            JsfUtil.errorDialog("getStatement() ", ex.getLocalizedMessage());

        }
        return null;
    }// </editor-fold>

   
   
   

    

}
