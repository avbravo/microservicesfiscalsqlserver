/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.microservicesfiscalsqlserver.sql.repository;

import com.avbravo.jmoordbutils.JsfUtil;
import com.avbravo.microservicesfiscalsqlserver.sql.tables.TPedidos;

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
public class TPedidosRepository extends Repository<TPedidos> {
 String tablename="Tpedidos";
    @Inject
    Connection connection;

    public TPedidosRepository() {
        super(TPedidos.class, "database");
    }

    @Override
    public Object find(String key, Object value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    public Optional<TPedidos> findBy(String key, Object value) {
//        List<TPedidos> list = new ArrayList<>();
//        // TPedidos TPedidos = new TPedidos();
//
//        try {
//
//            Statement sta = getStatement();
//            String jdbcJtdsSql = "SELECT * FROM TPedidos where " + key + " = " + value + "";
//
//            ResultSet rs = sta.executeQuery(jdbcJtdsSql);
//            rs = sta.executeQuery(jdbcJtdsSql);
//            while (rs.next()) {
//                Integer idTPedidos = rs.getInt("idTPedidos");
//                //  String name = rs.getString("fecha");
//                int estado = rs.getInt("estado");
//                TPedidos TPedidos = new TPedidos(idTPedidos, estado);
//                System.out.println("--------------> se encontro esa TPedidos");
//                return Optional.of(TPedidos);
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
//    public Optional<TPedidos> findByIdTPedidos(Integer value) {
//        List<TPedidos> list = new ArrayList<>();
//        // TPedidos TPedidos = new TPedidos();
//
//        try {
//
//            Statement sta = getStatement();
//            String jdbcJtdsSql = "SELECT * FROM TPedidos where idTPedidos=" + value + "";
//
//            ResultSet rs = sta.executeQuery(jdbcJtdsSql);
//            rs = sta.executeQuery(jdbcJtdsSql);
//            while (rs.next()) {
//                Integer idTPedidos = rs.getInt("idTPedidos");
//                int estado = rs.getInt("estado");
//                TPedidos TPedidos = new TPedidos(idTPedidos, estado);
//                return Optional.of(TPedidos);
//                //r
////                System.out.println("id: " + id + ", name: " + name + ", quantity: " + quantity);
//            }
//        } catch (Exception e) {
//            System.out.println("findBy " + e.getLocalizedMessage());
//
//        }
//        System.out.println(">>>> no se encontro la TPedidos");
//        return Optional.empty();
//    }

    public List<TPedidos> findAll() {
        List<TPedidos> list = new ArrayList<>();

        try {

            BeanListHandler<TPedidos> beanListHandler
                    = new BeanListHandler<>(TPedidos.class);

            QueryRunner runner = new QueryRunner();
            list = runner.query(connection, "SELECT * FROM "+tablename, beanListHandler);

        } catch (Exception e) {
            JsfUtil.errorDialog("findAll()", e.getLocalizedMessage());
        }
        return list;
    }

}
