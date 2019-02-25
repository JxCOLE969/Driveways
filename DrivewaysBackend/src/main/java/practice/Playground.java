package practice;

import org.hibernate.SessionFactory;

import entity.User;
import util.HibernateUtil;

public class Playground {

	public static SessionFactory sf = HibernateUtil.getSessionFactory();

	public static void main(String[] args) {

		startup();
		sf.close();

	}

	public static void startup() {
		User Test = new User();
		Test.setUsername("Test1");
		Test.setPhone("5555555555");

	}

}
