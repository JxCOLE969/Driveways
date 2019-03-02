package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "reservation")
public class Reservation {

	@Id
	@GeneratedValue
	private int rid;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<DWUser> dWUsers = new ArrayList<DWUser>();
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Listing> listings = new ArrayList<Listing>();
	
	private int lid;
	private int spotindex;
	private int u_id;
	
	public Reservation() {
		
	}
	
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
		return u_id;
	}
	public void setUid(int uid) {
		this.u_id = uid;
	}
	public int getSpotindex() {
		return spotindex;
	}
	public void setSpotindex(int spotindex) {
		this.spotindex = spotindex;
	}
	
	
	
	
}

