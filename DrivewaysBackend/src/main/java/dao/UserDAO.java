package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import entity.DWUser;
import util.HibernateUtil;

public class UserDAO implements IUser {

	public static SessionFactory sf = HibernateUtil.getSessionFactory();

	public DWUser getUser(String un, String pw) {

		try {

			Session sess = sf.openSession();

			Criteria crit = sess.createCriteria(DWUser.class);
			crit.add(Restrictions.like("username", un));
			crit.add(Restrictions.like("password", pw));

			System.out.println("username" +un  +" password" + pw);
			
			List<DWUser> u = crit.list();
			return u.get(0);

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public boolean addOrUpdateUser(DWUser u) {

		try {
			Session sess = sf.openSession();
			
			sess.beginTransaction();

			sess.saveOrUpdate(u);
			
			sess.getTransaction().commit();

			sess.close();

			return true;

		} catch (Exception e) {
			return false;
		}

	}

	public boolean deleteUser(int uid) {
		try {
			Session sess = sf.openSession();
			DWUser u = sess.get(DWUser.class, uid);
			sess.beginTransaction();
			sess.delete(u);
			sess.getTransaction().commit();
			sess.close();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public List<DWUser> allUsers() {
		try {

			Session sess = sf.openSession();

			Criteria crit = sess.createCriteria(DWUser.class);

			List<DWUser> u = crit.list();

			return u;

		} catch (Exception e) {
			return null;
		}
	}

}
