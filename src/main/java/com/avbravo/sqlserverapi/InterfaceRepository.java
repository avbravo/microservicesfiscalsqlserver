/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.sqlserverapi;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author avbravo
 */
public interface InterfaceRepository<T> {

   // public Connection getConnectionClient();

    public Statement getStatement();

    public T find(String key, Object value);

}
