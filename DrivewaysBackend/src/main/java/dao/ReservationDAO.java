package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entity.Reservation;
import util.HibernateUtil;

public class ReservationDAO implements IReservation
{
	
	private static SessionFactory sf = HibernateUtil.getSessionFactory();

	public Reservation getReservation(int rid) 
	{
		try
		{
			Session sess = sf.openSession();
			Reservation res = sess.get(Reservation.class, rid);
			sess.close();
			
			return res;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
		return null;
	}

	public boolean addOrUpdateReservation(Reservation res) 
	{
		try
		{
			Session sess = sf.openSession();
			sess.beginTransaction();
			sess.saveOrUpdate(res);
			sess.getTransaction().commit();
			sess.close();
			
			
			return true;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
		return false;
	}

	public boolean deleteReservation(int rid) 
	{
		try
		{
			Session sess = sf.openSession();
			Reservation res = sess.get(Reservation.class, rid);
			sess.beginTransaction();
			sess.delete(res);
			sess.getTransaction().commit();
			sess.close();
			
			return true;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
		return false;
	}

	public List<Reservation> allReservations() 
	{
		try
		{
			Session sess = sf.openSession();
			Criteria crit = sess.createCriteria(Reservation.class);

	        List<Reservation> r = crit.list();

	        return r;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
		return null;
	}

}
