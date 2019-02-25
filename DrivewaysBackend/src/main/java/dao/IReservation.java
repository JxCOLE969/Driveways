package dao;

import java.util.List;

import entity.Reservation;

public interface IReservation 
{
	public Reservation getReservation(int rid);
	
	public boolean addOrUpdateReservation(Reservation res);
	
	public boolean deleteReservation(int rid);
	
	public List<Reservation> allReservations();
}
