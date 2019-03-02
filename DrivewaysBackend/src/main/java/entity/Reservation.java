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
	
	public Reservation(int lid, int spotindex, int u_id) {
		this.lid = lid;
		this.spotindex = spotindex;
		this.u_id = u_id;
	}
	
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
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public int getSpotindex() {
		return spotindex;
	}
	public void setSpotindex(int spotindex) {
		this.spotindex = spotindex;
	}
	
	
	
	
}

