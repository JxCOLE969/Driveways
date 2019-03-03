package practice;

import dao.ListingDAO;
import dao.ReservationDAO;
import dao.UserDAO;
import entity.DWUser;
import entity.Listing;
import entity.Reservation;
import util.HibernateUtil;

public class Playground {
		
	private static UserDAO ud = new UserDAO();
	private static ListingDAO ld = new ListingDAO();
	private static ReservationDAO rd = new ReservationDAO();
	
	public static void main(String[] args) {
		
		addTestData();
		
		HibernateUtil.getSessionFactory().close();
	}

	public static void addTestData() 
	{
		DWUser user1 = new DWUser();
		user1.setUsername("test1");
		user1.setPassword("testpass1");
		user1.setRole(0);
		user1.setPhone("5555555555");
		ud.addOrUpdateUser(user1);
		
		DWUser user2 = new DWUser();
		user2.setUsername("test2");
		user2.setPassword("testpass2");
		user2.setRole(1);
		user2.setPhone("1234567890");
		ud.addOrUpdateUser(user2);
		
		Listing listing1 = new Listing();;
		listing1.setU_id(user1.getUid());
		listing1.setAddress("123 Main St.");
		listing1.setActive(1);
		listing1.setCost(5);
		listing1.setDescripto("5 minute walk from the Great American Ball Park.");
		listing1.setSpots(2);
		ld.addOrUpdateListing(listing1);
		
		Listing listing2 = new Listing();
		listing2.setU_id(user1.getUid());
		listing2.setAddress("1234 Broken Dreams Blvd.");
		listing2.setActive(1);
		listing2.setCost(3);
		listing2.setDescripto("10 minute walk on a lonely road from the Great American Ball Park.");
		listing2.setSpots(5);
		ld.addOrUpdateListing(listing2);
		
		Reservation reservation1 = new Reservation();
		reservation1.setLid(listing1.getLid());
		reservation1.setSpotindex(0);
		reservation1.setU_id(2);
		rd.addOrUpdateReservation(reservation1);
		
		Reservation reservation2 = new Reservation();
		reservation2.setLid(listing2.getLid());
		reservation2.setSpotindex(0);
		reservation2.setU_id(2);
		rd.addOrUpdateReservation(reservation2);
	}
}
