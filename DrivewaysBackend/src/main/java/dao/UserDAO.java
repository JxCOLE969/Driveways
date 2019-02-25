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

	public User getUser(String un, String pw) {

		try {

			Session sess = sf.openSession();

			Criteria crit = sess.createCriteria(User.class);
			crit.add(Restrictions.eq("username", un));
			crit.add(Restrictions.eq("password", pw));

			List<User> u = crit.list();
			return u.get(0);

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

	public boolean deleteUser(int uid) {
		try {
			Session sess = sf.openSession();
			User u = sess.get(User.class, uid);
			sess.beginTransaction();
			sess.delete(u);
			sess.getTransaction().commit();
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
