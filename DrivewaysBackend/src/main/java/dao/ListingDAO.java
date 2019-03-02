package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entity.Listing;
import util.HibernateUtil;

public class ListingDAO implements IListing {

	public static SessionFactory sf = HibernateUtil.getSessionFactory();

	public Listing getListing(int lid) {

		try {
			Session sess = sf.openSession();
			Listing list = sess.get(Listing.class, lid);
			sess.close();

			return list;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean addOrUpdateListing(Listing l) { // Also used for adding listings as well.

		try {

			Session sess = sf.openSession();
			
			sess.beginTransaction();

			sess.saveOrUpdate(l);
			
			sess.getTransaction().commit();

			sess.close();

			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean deleteListing(int lid) {

		try {
			Session sess = sf.openSession();
			Listing list = sess.get(Listing.class, lid);
			sess.beginTransaction();
			sess.delete(list);
			sess.getTransaction().commit();
			sess.close();

			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return false;

	}

	public List<Listing> allListings() {

		try {

			Session sess = sf.openSession();

			Criteria crit = sess.createCriteria(Listing.class);

			List<Listing> l = crit.list();

			return l;

		} catch (Exception e) {
			return null;
		}

	}

}
