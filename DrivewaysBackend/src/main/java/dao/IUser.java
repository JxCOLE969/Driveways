package dao;
import java.util.List;

import entity.User;

public interface IUser {

//	public boolean addUser(User u);
	public List<User> getUser(String un, String pw);
	public boolean updateUser(User u);
	public List<User> allUsers();
}
