package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import entity.User;
import util.HibernateUtil;

public class UserDAO implements IUser {

	public static SessionFactory sf = HibernateUtil.getSessionFactory();

//	public boolean addUser(User u) {
//
//		try {
//
//			Session sess = sf.openSession();
//
//			// creates that atomic unit of logic
//			sess.beginTransaction();
//
//			sess.persist(u);
//
//			sess.getTransaction().commit();
//
//			// indicates we are done with the db for now
//			sess.close();
//
//		} catch (Exception e) {
//
//		}
//		return false;
//	}

	public List<User> getUser(String un, String pw) {

		try {

			Session sess = sf.openSession();

			Criteria crit = sess.createCriteria(User.class);
			crit.add(Restrictions.eq("username", un));
			crit.add(Restrictions.eq("password", pw));

			List<User> u = crit.list();
			return u;

		} catch (Exception e) {
			return null;
		}

	}

	public boolean addOrUpdateUser(User u) {

		try {
			Session sess = sf.openSession();
			
			sess.saveOrUpdate(u);

			sess.close();

			return true;

		} catch (Exception e) {
			return false;
		}

	}

	public List<User> allUsers() {
		try {
			
			Session sess = sf.openSession();

			Criteria crit = sess.createCriteria(User.class);

			List<User> u = crit.list();
			
			return u;
			
		} catch (Exception e) {
			return null;
		}
	}

}
