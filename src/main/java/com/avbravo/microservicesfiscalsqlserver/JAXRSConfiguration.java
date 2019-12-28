package com.avbravo.microservicesfiscalsqlserver;

import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Configures JAX-RS for the application.
 *
 * @author Juneau
 */
@ApplicationPath("resources")
public class JAXRSConfiguration extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        resources.add(com.avbravo.microservicesfiscalsqlserver.resources.FacturaResources.class);
        resources.add(com.avbravo.microservicesfiscalsqlserver.resources.TClientesResources.class);
        resources.add(com.avbravo.microservicesfiscalsqlserver.resources.TEfectosCobroResources.class);
        resources.add(com.avbravo.microservicesfiscalsqlserver.resources.TFacturaResources.class);
        resources.add(com.avbravo.microservicesfiscalsqlserver.resources.TPedidosEnLineaResources.class);
        resources.add(com.avbravo.microservicesfiscalsqlserver.resources.TPedidosResources.class);
        resources.add(com.avbravo.microservicesfiscalsqlserver.resources.JavaEE8Resource.class);

        return resources;
    }
}
