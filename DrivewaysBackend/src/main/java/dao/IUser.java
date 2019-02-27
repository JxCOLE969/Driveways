package dao;
import java.util.List;

import entity.DWUser;

public interface IUser {

	public DWUser getUser(String un, String pw);
	public boolean addOrUpdateUser(DWUser u);
	public boolean deleteUser(int uid);
	public List<DWUser> allUsers();
}
