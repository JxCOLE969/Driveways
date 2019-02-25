package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Reservation {

	@Id
	@GeneratedValue
	private int rid;
	
	private int lid;
	private int uid;
	private int spotindex;
	
	
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getSpotindex() {
		return spotindex;
	}
	public void setSpotindex(int spotindex) {
		this.spotindex = spotindex;
	}
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<User> users = new ArrayList<User>();
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Listing> listings = new ArrayList<Listing>();
	
	
}

