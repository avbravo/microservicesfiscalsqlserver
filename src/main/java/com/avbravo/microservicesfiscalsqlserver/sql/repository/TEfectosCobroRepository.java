/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.microservicesfiscalsqlserver.sql.repository;

import com.avbravo.jmoordbutils.JsfUtil;
import com.avbravo.microservicesfiscalsqlserver.sql.entity.TEfectosCobro;

import com.avbravo.sqlserverapi.Repository;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

/**
 *
 * @author avbravo
 */
@Stateless
public class TEfectosCobroRepository extends Repository<TEfectosCobro> {
  String tablename="Tefectoscobro";
    @Inject
    Connection connection;

    public TEfectosCobroRepository() {
        super(TEfectosCobro.class, "database");
    }

    @Override
    public Object find(String key, Object value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    public Optional<Tclientes> findBy(String key, Object value) {
//        List<Tclientes> list = new ArrayList<>();
//        // Tclientes Tclientes = new Tclientes();
//
//        try {
//
//            Statement sta = getStatement();
//            String jdbcJtdsSql = "SELECT * FROM Tclientes where " + key + " = " + value + "";
//
//            ResultSet rs = sta.executeQuery(jdbcJtdsSql);
//            rs = sta.executeQuery(jdbcJtdsSql);
//            while (rs.next()) {
//                Integer idTclientes = rs.getInt("idTclientes");
//                //  String name = rs.getString("fecha");
//                int estado = rs.getInt("estado");
//                Tclientes Tclientes = new Tclientes(idTclientes, estado);
//                System.out.println("--------------> se encontro esa Tclientes");
//                return Optional.of(Tclientes);
//                //r
////                System.out.println("id: " + id + ", name: " + name + ", quantity: " + quantity);
//            }
//        } catch (Exception e) {
//            System.out.println("findBy " + e.getLocalizedMessage());
//            JsfUtil.errorDialog("findBy()", e.getLocalizedMessage());
//        }
//
//        return Optional.empty();
//    }
//
//    public Optional<Tclientes> findByIdTclientes(Integer value) {
//        List<Tclientes> list = new ArrayList<>();
//        // Tclientes Tclientes = new Tclientes();
//
//        try {
//
//            Statement sta = getStatement();
//            String jdbcJtdsSql = "SELECT * FROM Tclientes where idTclientes=" + value + "";
//
//            ResultSet rs = sta.executeQuery(jdbcJtdsSql);
//            rs = sta.executeQuery(jdbcJtdsSql);
//            while (rs.next()) {
//                Integer idTclientes = rs.getInt("idTclientes");
//                int estado = rs.getInt("estado");
//                Tclientes Tclientes = new Tclientes(idTclientes, estado);
//                return Optional.of(Tclientes);
//                //r
////                System.out.println("id: " + id + ", name: " + name + ", quantity: " + quantity);
//            }
//        } catch (Exception e) {
//            System.out.println("findBy " + e.getLocalizedMessage());
//
//        }
//        System.out.println(">>>> no se encontro la Tclientes");
//        return Optional.empty();
//    }

    public List<TEfectosCobro> findAll() {
        List<TEfectosCobro> list = new ArrayList<>();

        try {

            BeanListHandler<TEfectosCobro> beanListHandler
                    = new BeanListHandler<>(TEfectosCobro.class);

            QueryRunner runner = new QueryRunner();
            list = runner.query(connection, "SELECT * FROM "+tablename, beanListHandler);

        } catch (Exception e) {
            JsfUtil.errorDialog("findAll()", e.getLocalizedMessage());
        }
        return list;
    }

}
