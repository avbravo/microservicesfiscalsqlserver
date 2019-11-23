/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.microservicesfiscalsqlserver.repository;

import com.avbravo.jmoordbutils.JsfUtil;
import com.avbravo.microservicesfiscalsqlserver.entity.Factura;

import com.avbravo.sqlserverapi.Repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author avbravo
 */
@Stateless
public class FacturaRepository extends Repository<Factura> {

   

    public FacturaRepository() {
        super(Factura.class,"database");
    }

    @Override
    public Object find(String key, Object value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public Optional<Factura> findBy(String key, Object value) {
        List<Factura> list = new ArrayList<>();
       // Factura factura = new Factura();
          
       try {
          
           
            Statement sta = getStatement();
            String jdbcJtdsSql = "SELECT * FROM factura where '"+key+"' = '"+value +"'";
            ResultSet rs = sta.executeQuery(jdbcJtdsSql);
            rs = sta.executeQuery(jdbcJtdsSql);
            while (rs.next()) {
                Integer idfactura = rs.getInt("idfactura");
              //  String name = rs.getString("fecha");
                int estado = rs.getInt("estado");
                Factura factura = new Factura(idfactura, estado);
                 return Optional.of(factura);
                //r
//                System.out.println("id: " + id + ", name: " + name + ", quantity: " + quantity);
            }
       } catch (Exception e) {
           JsfUtil.errorDialog("findAll()", e.getLocalizedMessage());
       }
       return Optional.empty();
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
   public Boolean insert(Factura factura){
     Boolean saved=false;
          
       try {
           
            Statement stmt = getStatement();
            String sql = "INSERT INTO factura " +
                   "VALUES ("+factura.getIdfactura()+","+factura.getEstado()+")";
   if(stmt.executeUpdate(sql) >0){
       saved=true;
   }
      
       } catch (Exception e) {
           JsfUtil.errorDialog("findAll()", e.getLocalizedMessage());
       }
       return saved;
   }
   
   
   

}
