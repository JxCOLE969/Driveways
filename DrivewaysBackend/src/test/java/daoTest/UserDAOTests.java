package daoTest;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import dao.UserDAO;
import entity.DWUser;
import practice.Playground;
import util.HibernateUtil;

public class UserDAOTests 
{
	public static UserDAO ud = new UserDAO();
	
	@AfterClass
	public void teardown() {
		HibernateUtil.getSessionFactory().close();
	}
	
	@Test(priority=1)
	public void createUserTest()
	{
		boolean addedUser = ud.addOrUpdateUser(new DWUser("testusername","testpassword",0,"1234512345"));
		Assert.assertTrue(addedUser);
	}
	
	@Test(priority=2)
	public void getUserTest()
	{
		DWUser testuser = ud.getUser("testusername", "testpassword");
		Assert.assertNotNull(testuser);
	}
	
	@Test(priority=2)
	public void getAllUserTest()
	{
		List<DWUser> testusers = ud.allUsers();
		Assert.assertNotNull(testusers);
	}
	
	@Test(priority=3)
	public void updateUserTest()
	{
		DWUser testuser = ud.getUser("testusername", "testpassword");
		testuser.setPhone("5432154321");
		boolean updatedUser = ud.addOrUpdateUser(testuser);
		Assert.assertTrue(updatedUser);
	}
	
	@Test(priority=4)
	public void deleteUserTest()
	{
		DWUser testuser = ud.getUser("testusername", "testpassword");
		boolean deletedUser = ud.deleteUser(testuser.getUid());
		Assert.assertTrue(deletedUser);
	}
}
