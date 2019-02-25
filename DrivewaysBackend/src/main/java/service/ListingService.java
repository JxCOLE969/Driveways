package service;

import java.util.List;

import dao.ListingDAO;
import entity.Listing;

public class ListingService 
{
public static ListingDAO ld = new ListingDAO();
	
	public static Listing getListing(int lid)
	{
		return ld.getListing(lid);
	}
	
	public static boolean addOrUpdateListing(Listing listing)
	{
		return ld.addOrUpdateListing(listing);
	}
	
	public static boolean deleteListing(int rid)
	{
		return ld.deleteListing(rid);
	}
	
	public static List<Listing> allListings()
	{
		return ld.allListings();
	}
}
