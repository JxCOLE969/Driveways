package util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sf;

	private HibernateUtil() {
	}

	public static SessionFactory getSessionFactory() {

		if (sf == null) {

			try {
				Configuration cfg = new Configuration();
				sf = cfg.configure().buildSessionFactory();
			} catch (HibernateException exception) {
				System.out.println("Problem creating session factory");
				exception.printStackTrace();
			}
		}

		return sf;
	}

}
