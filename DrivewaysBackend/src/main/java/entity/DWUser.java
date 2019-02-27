
package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Entity
@Table(name = "dwuser")
public class DWUser {

	@Id // marks it as a the primary key
	@GeneratedValue // generated a unique value
	private int u_id;

	private String username;
	private String password;
	private int role_;
	private String phone;

	public DWUser() {
		
	}

	public DWUser(String un, String pw, int role2, String phone2) {
		this.setUsername(un);
		this.setPassword(pw);
		this.setRole(role2);
		this.setPhone(phone2);
	}

	public int getUid() {
		return u_id;
	}

	public void setUid(int uid) {
		this.u_id = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRole() {
		return role_;
	}

	public void setRole(int role) {
		this.role_ = role;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
