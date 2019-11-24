/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.microservicesfiscalsqlserver.resources;

import com.avbravo.microservicesfiscalsqlserver.entity.Factura;
import com.avbravo.microservicesfiscalsqlserver.repository.FacturaRepository;
import java.net.URI;
import java.net.URISyntaxException;
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

        return facturaRepository.findAll();
    }

   
    @POST
    @Path("/factura/add")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createTrackInJSON(Factura factura) {
        try {

            Optional<Factura> optional = facturaRepository.findBy("idfactura", factura.getIdfactura());

            if (optional.isPresent()) {

                return Response.status(400).entity("Existe una factura con ese id!").build();
            }

            if (facturaRepository.insert(factura)) {

                return Response.status(201).entity("Se guardo la factura").build();
            }
//Response.ok().build();
            return Response.status(400).entity("No se guardo la factura").build();
        } catch (Exception e) {
            return Response.status(400).entity("Ocurrio un error!!" + e.getLocalizedMessage()).build();
        }

    }
}
