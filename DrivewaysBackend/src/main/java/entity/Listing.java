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
@Table(name = "listing")
public class Listing {
	
	@Id
	@GeneratedValue
	private int lid;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<DWUser> dWUsers = new ArrayList<DWUser>();
	
	private int u_id;
	private int spots;
	private int active;
	private String address;
	private String descripto;
	private double distance;
	private double cost;
	
	public Listing() {
		
	}
	
	public Listing(int u_id, int spots, int active, String address, String descripto,
			double distance, double cost) {
//		super();
		this.u_id = u_id;
		this.spots = spots;
		this.active = active;
		this.address = address;
		this.descripto = descripto;
		this.distance = distance;
		this.cost = cost;
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
	public int getSpots() {
		return spots;
	}
	public void setSpots(int spots) {
		this.spots = spots;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescripto() {
		return descripto;
	}
	public void setDescripto(String descripto) {
		this.descripto = descripto;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}

	
	
}

