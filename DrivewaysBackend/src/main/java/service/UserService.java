package service;

import java.util.List;

import dao.UserDAO;
import entity.User;

public class UserService 
{
	public static UserDAO ud = new UserDAO();
	
	public static User getUser(String username, String password)
	{
		return ud.getUser(username, password);
	}
	
	public static boolean addOrUpdateUser(User user)
	{
		return ud.addOrUpdateUser(user);
	}
	
	public static boolean deleteUser(int rid)
	{
		return ud.deleteUser(rid);
	}
	
	public static List<User> allUsers()
	{
		return ud.allUsers();
	}
}
