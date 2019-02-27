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
	private String descript;
	private double distance;
	private double cost;
	
	public Listing() {
		
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
	public String getDescription() {
		return descript;
	}
	public void setDescription(String description) {
		this.descript = description;
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

