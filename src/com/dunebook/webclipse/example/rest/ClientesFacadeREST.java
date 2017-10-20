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
import com.dunebook.webclipse.example.EntityManagerHelper;
import com.dunebook.webclipse.example.Clientes;
/**
 * Created by jyera on 20/10/2017.
 */
@javax.inject.Singleton
@Path("Clientes")
public class ClientesFacadeREST extends AbstractFacade<Clientes> {
	private EntityManager em;
	public ClientesFacadeREST() {
		super(Clientes.class);
	}	
	@PUT
	@Override
	@Consumes({ "application/xml", "application/json" })
	public Response edit(Clientes entity) {
		if (entity.getNombre().length() <= 3) {
			return Response.status(Status.CONFLICT).entity("Customer name is too short").type(MediaType.TEXT_PLAIN).build();
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
	public Clientes find(@PathParam("id") Integer id) {
		return super.find(id);
	}

	@GET
	@Override
	@Produces({ "application/json" })
	public List<Clientes> findAll() {
		return super.findAll();
	}

	@GET
	@Path("{from}/{to}")
	@Produces({ "application/xml", "application/json" })
	public List<Clientes> findRange(@PathParam("from") Integer from,
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
	