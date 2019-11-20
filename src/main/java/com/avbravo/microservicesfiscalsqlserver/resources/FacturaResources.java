/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.microservicesfiscalsqlserver.resources;


import com.avbravo.microservicesfiscalsqlserver.database.Factura;
import com.avbravo.microservicesfiscalsqlserver.repository.FacturaRepository;
import java.util.List;
import java.util.Optional;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 *
 * @author avbravo
 */
@Stateless
@Path("factura")
public class FacturaResources {

    @Inject
    FacturaRepository facturaRepository;

    @GET
    @Path("{idfactura}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Factura find(@PathParam("idfactura") Integer idfactura) {
        Factura factura = new Factura();
        try {
            Optional<Factura> optional = facturaRepository.findBy("idfactura",idfactura);
           if(optional.isPresent()){
               factura= optional.get();
           }
           
     
        } catch (Exception e) {
            System.out.println("Error find() " + e.getLocalizedMessage());
        }
        return factura;
    }

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Factura> findAll() {
        List<Factura> list = facturaRepository.findAll();
        list.forEach((p) -> {
            System.out.println(""+p.getIdfactura());
        });
        return facturaRepository.findAll();
    }
}
