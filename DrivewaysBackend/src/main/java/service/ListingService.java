package service;

import java.util.List;

import dao.ListingDAO;
import entity.Listing;

public class ListingService {
	public static ListingDAO ld = new ListingDAO();

	public static List<Listing> getListings() {

		List<Listing> listings = ld.allListings();

		return listings;

	}
	
	public static Listing getListing(String address) {

		Listing listing = ld.getListing(address);

		return listing;

	}

	public static Listing getListing(int lid) {

		Listing listing = ld.getListing(lid);

		return listing;

	}

	public static boolean addListing(Listing listing) {

		boolean added = ld.addOrUpdateListing(listing);

		return added;
	}
	
	public static boolean deleteListing(int lid) {
		
		boolean deleted = ld.deleteListing(lid);
		
		return deleted;
	}
	
}
