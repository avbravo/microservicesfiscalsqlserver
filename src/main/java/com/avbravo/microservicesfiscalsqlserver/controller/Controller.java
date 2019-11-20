/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.microservicesfiscalsqlserver.controller;

import com.avbravo.microservicesfiscalsqlserver.repository.FacturaRepository;
import java.io.Serializable;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author avbravo
 */
@Named
public class Controller implements Serializable{
    @Inject
    FacturaRepository facturaRepository;
    
    public String findAll(){
        facturaRepository.findAll();
        return "";
    }
}
