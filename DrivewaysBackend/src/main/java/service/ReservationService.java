package service;

import java.util.List;

import dao.ReservationDAO;
import entity.Listing;
import entity.Reservation;

public class ReservationService {

	public static ReservationDAO rd = new ReservationDAO();

	public static List<Reservation> getReservations() {
		return rd.allReservations();
	}

	public static Reservation getReservation(int rid) {
		return rd.getReservation(rid);
	}

	public static boolean addReservation(Reservation reservation) {

		return rd.addOrUpdateReservation(reservation);
	}

	public static boolean deleteReservation(int rid) {
		return rd.deleteReservation(rid);
	}

}
