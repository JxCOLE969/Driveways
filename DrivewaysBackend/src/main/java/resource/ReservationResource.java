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

import entity.Reservation;
import service.ReservationService;

@Path("reservations")
public class ReservationResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public static Response getAllReservations() {

		System.out.println("In getAllReservations");

		List<Reservation> reservations = ReservationService.getReservations();

		return Response.ok(reservations, MediaType.APPLICATION_JSON).build();

	}

	@GET
	@Path("/reservation")
	@Produces({ MediaType.APPLICATION_JSON })
	public static Response getListing(@QueryParam("rid") int rid, @Context HttpHeaders headers) {

		Reservation reservation = ReservationService.getReservation(rid);
		System.out.println(reservation.toString());

		return Response.ok(reservation, MediaType.APPLICATION_JSON).build();

	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public static Response createReservation(Reservation reservation) {

		boolean added = ReservationService.addReservation(reservation);

		if (added) {
			return Response.ok("Added reservation").build();

		} else {
			return Response.ok("Did not add reservation").build();
		}

	}

	@DELETE
	public static Response deleteReservation(@QueryParam("rid") int rid) {

		ReservationService.deleteReservation(rid);
		return Response.ok("Deleted reservation").build();
	}

	@PUT
	public static Response updateReservation(Reservation reservation) {

		boolean updated = ReservationService.addReservation(reservation);

		return Response.ok("Updated reservation").build();
	}

}
