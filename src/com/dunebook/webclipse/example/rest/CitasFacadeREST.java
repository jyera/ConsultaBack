package com.dunebook.webclipse.example.rest;
import java.util.List;
import javax.persistence.EntityManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.dunebook.webclipse.example.Citas;
import com.dunebook.webclipse.example.EntityManagerHelper;

/**
 * Created by jyera on 20/10/2017.
 */

@javax.inject.Singleton
@Path("Citas")
public class CitasFacadeREST extends AbstractFacade<Citas> {
    private EntityManager em;
    public CitasFacadeREST() {
        super(Citas.class);
    }
    @PUT
    @Override
    @Consumes({ "application/xml", "application/json" })
    public Response edit(Citas entity) {
        if (entity.getIdCliente() == null) {
            return Response.status(Status.CONFLICT).entity("La cita no tiene cliente asociado").type(MediaType.TEXT_PLAIN).build();
        }
        return super.edit(entity);
    }
    @DELETE
    @Path("remove/{id}")
    public Response remove(@PathParam("id") Integer id) {
        return super.remove(super.find(id));
    }
    @GET
    @Path("{id}")
    @Produces({ "application/json" })
    public Citas find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({ "application/json" })
    public List<Citas> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({ "application/xml", "application/json" })
    public List<Citas> findRange(@PathParam("from") Integer from,
                                    @PathParam("to") Integer to) {
        return super.findRange(new int[] { from, to });
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        em = EntityManagerHelper.getEntityManager();
        return em;
    }
}

