package org.yan.hibernate;

import java.io.File;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.rock.dong.dto.UserDetails;

public class HibernateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		UserDetails user = new UserDetails();
        
        user.setUserName("Third User");
        user.setAddress("Third User's address");
        user.setJoinedDate(new Date());
        user.setDescription("Description of the user goes here");
        
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
        
        // sessionFactory.close();

        
	}

}
