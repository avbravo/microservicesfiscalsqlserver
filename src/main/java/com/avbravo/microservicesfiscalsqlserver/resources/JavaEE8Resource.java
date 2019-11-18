package com.avbravo.microservicesfiscalsqlserver.resources;

import com.avbravo.microservicesfiscalsqlserver.database.Factura;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author
 */
@Path("javaee8")
public class JavaEE8Resource {

    @GET
    public Response ping() {
        return Response
                .ok("ping")
                .build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Factura> findAllFacturas() {
//Find all departments from the data store
        List<Factura> departments = findAll();
        return departments;
    }
//

    private List<Factura> findAll() {
        List<Factura> l = new ArrayList<>();
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:jtds:sqlserver://localhost:1433/GRUPOMORENO;instance=SQLEXPRESS;", "sa", "12345aA-bB");
            Statement sta = conn.createStatement();
            String jdbcJtdsSql = "SELECT * FROM factura";
            ResultSet rs = sta.executeQuery(jdbcJtdsSql);
            rs = sta.executeQuery(jdbcJtdsSql);
            while (rs.next()) {
                Integer id = rs.getInt("idfactura");
              //  String name = rs.getString("fecha");
                int quantity = rs.getInt("estado");
                Factura factura = new Factura(id, quantity);
                l.add(factura);
                //r
//                System.out.println("id: " + id + ", name: " + name + ", quantity: " + quantity);
            }
        } catch (Exception e) {
        }
        return l;
    }
}
