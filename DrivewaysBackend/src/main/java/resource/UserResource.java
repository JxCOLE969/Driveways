package resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import dao.UserDAO;
import entity.DWUser;
import service.UserService;

@Path("users")
public class UserResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public static Response getAllUsers() {

		System.out.println("In getAllUsers");
		
		List<DWUser> dWUsers = UserService.getUsers();
	
		return Response.ok(dWUsers, MediaType.APPLICATION_JSON).build();

	}

	@GET
	@Path("/{username}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public static Response getAssociate(@PathParam("username") String username, @PathParam("password") String password,
			@Context HttpHeaders headers) {

		DWUser u = UserService.getUser(username, password);
		System.out.println(u.toString());

		if (headers.getRequestHeader("Content-Type").get(0).equals("application/json")) {
			return Response.ok(u, MediaType.APPLICATION_JSON).build();
		}

		if (headers.getRequestHeader("Content-Type").get(0).equals("application/xml")) {
			return Response.ok(u, MediaType.APPLICATION_XML).build();
		}

		return Response.ok(u.toString(), MediaType.TEXT_PLAIN).build();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public static Response createUser(DWUser dWUser) {
		
		UserService.addUser(dWUser);

		return Response.ok().build();
	}

}
