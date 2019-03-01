package resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import dao.ListingDAO;
import entity.Listing;
import service.ListingService;

@Path("listings")
public class ListingResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public static Response getAllListings() {

		System.out.println("In getAllListings");

		List<Listing> listings = ListingService.getListings();

		return Response.ok(listings, MediaType.APPLICATION_JSON).build();

	}

	@GET
	@Path("/listing")
	@Produces({ MediaType.APPLICATION_JSON })
	public static Response getListing(@QueryParam("lid") int lid, @Context HttpHeaders headers) {

		Listing listing = ListingService.getListing(lid);
		System.out.println(listing.toString());

		return Response.ok(listing, MediaType.APPLICATION_JSON).build();

	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public static Response createListing(Listing listing) {

		boolean added = ListingService.addListing(listing);

		if (added) {
			return Response.ok("Added listing").build();

		} else {
			return Response.ok("Did not add listing").build();
		}

	}

	@DELETE
	public static Response deleteListing(@QueryParam("lid") int lid) {

		ListingService.deleteListing(lid);
		return Response.ok("Deleted listing").build();
	}

	@PUT
	public static Response updateListing(Listing listing) {

		boolean updated = ListingService.addListing(listing);
		
		return Response.ok("Updated listing").build();
	}

}
