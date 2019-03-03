package daoTest;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import dao.ListingDAO;
import dao.UserDAO;
import entity.Listing;
import practice.Playground;
import util.HibernateUtil;

public class ListingDAOTests {
	public static UserDAO ud = new UserDAO();
	public static ListingDAO ld = new ListingDAO();
	
	@BeforeClass
	public void startup() {
		Playground.addTestData();
	}
	
	@AfterClass
	public void teardown() {
		HibernateUtil.getSessionFactory().close();
	}
	
	@Test(priority=1)
	public void createListingTest()
	{
		
		boolean addedListing = ld.addOrUpdateListing(
				new Listing(ud.getUser("test1", "testpass1").getUid(), 2, 1, "111 1st St.", "description", 5.5, 3)
				);
		Assert.assertTrue(addedListing);
	}
	
	@Test(priority=2)
	public void getListingTest()
	{
		Listing testlisting = ld.getListing("111 1st St.");
		Assert.assertNotNull(testlisting);
	}
	
	@Test(priority=2)
	public void getAllListingTest()
	{
		List<Listing> testlistings = ld.allListings();
		Assert.assertNotNull(testlistings);
	}
	
	@Test(priority=3)
	public void updateListingTest()
	{
		Listing testlisting = ld.getListing("111 1st St.");
		testlisting.setDescripto("Updated Description");
		testlisting.setCost(100);
		boolean updatedListing = ld.addOrUpdateListing(testlisting);
		Assert.assertTrue(updatedListing);
	}
	
	@Test(priority=4)
	public void deleteListingTest()
	{
		Listing testlisting = ld.getListing("111 1st St.");
		boolean deletedListing = ld.deleteListing(testlisting.getLid());
		Assert.assertTrue(deletedListing);
	}
}
