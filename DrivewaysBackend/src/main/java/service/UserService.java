package service;

import java.util.List;

import dao.UserDAO;
import entity.DWUser;

public class UserService {

	public static UserDAO ud = new UserDAO();

	public static List<DWUser> getUsers() {

		List<DWUser> dWUsers = ud.allUsers();

		return dWUsers;

	}

	public static DWUser getUser(String username, String password) {

		DWUser dWUser = ud.getUser(username, password);

		return dWUser;

	}
	
	public static boolean addUser(DWUser u) {
		
		boolean added = ud.addOrUpdateUser(u);
		
		return added;
	}
}
