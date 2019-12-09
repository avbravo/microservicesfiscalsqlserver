/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.microservicesfiscalsqlserver.resources;


import com.avbravo.microservicesfiscalsqlserver.sql.repository.TPedidosEnLineaRepository;
import com.avbravo.microservicesfiscalsqlserver.sql.tables.TPedidosEnLinea;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author avbravo
 */
@Stateless
@Path("tpedidosenlinea")
public class TPedidosEnLineaResources {

    @Inject
    TPedidosEnLineaRepository repository;

  
  

    
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<TPedidosEnLinea> findAll() {

        return repository.findAll();
    }

   
   
}
