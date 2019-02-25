package dao;

import java.util.List;

import entity.Listing;

public interface IListing {
	
	public Listing getListing(int lid);
	public boolean addOrUpdateListing(Listing l);
	public boolean deleteListing(int lid);
	public List <Listing> allListings();

}
