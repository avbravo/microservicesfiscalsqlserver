/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.microservicesfiscalsqlserver.repository;

import com.avbravo.jmoordbutils.JsfUtil;
import com.avbravo.microservicesfiscalsqlserver.database.Factura;
import com.avbravo.microservicesfiscalsqlserver.provider.SQLServerClientProvider;
import com.avbravo.sqlserverapi.Repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author avbravo
 */
@Stateless
public class FacturaRepository extends Repository<Factura> {

    @Inject
    SQLServerClientProvider sqlServerClientProvider;

 
 
    protected Connection getConnectionClient() { 
        return sqlServerClientProvider.getConnectionClient();
    }

    public FacturaRepository() {
        super(Factura.class,"database");
    }

    @Override
    public Object find(String key, Object value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   public List<Factura> findAll(){
       List<Factura> list = new ArrayList<>();
          
       try {
           
            Statement sta = getStatement();
            String jdbcJtdsSql = "SELECT * FROM factura";
            ResultSet rs = sta.executeQuery(jdbcJtdsSql);
            rs = sta.executeQuery(jdbcJtdsSql);
            while (rs.next()) {
                Integer idfactura = rs.getInt("idfactura");
              //  String name = rs.getString("fecha");
                int estado = rs.getInt("estado");
                Factura factura = new Factura(idfactura, estado);
                list.add(factura);
                //r
//                System.out.println("id: " + id + ", name: " + name + ", quantity: " + quantity);
            }
       } catch (Exception e) {
           JsfUtil.errorDialog("findAll()", e.getLocalizedMessage());
       }
       return list;
   }

}