package service;

import java.util.List;

import dao.ReservationDAO;
import entity.Reservation;

public class ReservationService 
{
	public static ReservationDAO rd = new ReservationDAO();
	
	public static Reservation getReservation(int rid)
	{
		return rd.getReservation(rid);
	}
	
	public static boolean addOrUpdateReservation(Reservation res)
	{
		return rd.addOrUpdateReservation(res);
	}
	
	public static boolean deleteReservation(int rid)
	{
		return rd.deleteReservation(rid);
	}
	
	public static List<Reservation> allReservations()
	{
		return rd.allReservations();
	}
}
