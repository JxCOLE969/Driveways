package dao;
import java.util.List;

import entity.User;

public interface IUser {

//	public boolean addUser(User u);
	public List<User> getUser(String un, String pw);
	public boolean addOrUpdateUser(User u);
	public boolean deleteUser(int uid);
	public List<User> allUsers();
}
