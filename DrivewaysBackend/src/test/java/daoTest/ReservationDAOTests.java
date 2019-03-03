package daoTest;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import dao.ListingDAO;
import dao.ReservationDAO;
import dao.UserDAO;
import entity.Listing;
import entity.Reservation;
import practice.Playground;
import util.HibernateUtil;

public class ReservationDAOTests {
	public static UserDAO ud = new UserDAO();
	public static ListingDAO ld = new ListingDAO();
	public static ReservationDAO rd = new ReservationDAO();
	
	@BeforeClass
	public void startup() {
		Playground.addTestData();
	}
	
	@AfterClass
	public void teardown() {
		HibernateUtil.getSessionFactory().close();
	}
	
	@Test(priority=1)
	public void createReservationTest()
	{
		boolean addedReservation = rd.addOrUpdateReservation(new Reservation(1, 0, 2));
		Assert.assertTrue(addedReservation);
	}
	
	@Test(priority=2)
	public void getReservationTest()
	{
		Reservation testreservation = rd.getReservation(1, 0);
		Assert.assertNotNull(testreservation);
	}
	
	@Test(priority=2)
	public void getAllListingTest()
	{
		List<Reservation> testreservations = rd.allReservations();
		Assert.assertNotNull(testreservations);
	}
	
	@Test(priority=3)
	public void updateListingTest()
	{
		Reservation testreservation = rd.getReservation(1, 0);
		testreservation.setSpotindex(1);
		boolean updatedReservation = rd.addOrUpdateReservation(testreservation);
		Assert.assertTrue(updatedReservation);
	}
	
	@Test(priority=4)
	public void deleteListingTest()
	{
		Reservation testreservation = rd.getReservation(1, 1);
		boolean deletedReservation = rd.deleteReservation(testreservation.getRid());
		Assert.assertTrue(deletedReservation);
	}
}
