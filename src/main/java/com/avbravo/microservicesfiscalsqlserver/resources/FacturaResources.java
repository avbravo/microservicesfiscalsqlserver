/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.microservicesfiscalsqlserver.resources;

import com.avbravo.microservicesfiscalsqlserver.entity.Factura;
import com.avbravo.microservicesfiscalsqlserver.repository.FacturaRepository;
import java.util.List;
import java.util.Optional;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

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
            Optional<Factura> optional = facturaRepository.findBy("idfactura", idfactura);
            if (optional.isPresent()) {
                factura = optional.get();
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
            System.out.println("" + p.getIdfactura());
        });
        return facturaRepository.findAll();
    }

    @POST
    @Path("/factura/addjson")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addFactura(Factura factura) {
        System.out.println(factura.getIdfactura() + factura.getEstado());
    }

    @POST
    @Path("/add")
    @Produces("text/html")
    public Response create(@FormParam("idfactura") Integer idfactura,
            @FormParam("estado") Integer estado) {
        facturaRepository.insert(new Factura(idfactura, estado));
        return Response.ok().build();

    }
}
