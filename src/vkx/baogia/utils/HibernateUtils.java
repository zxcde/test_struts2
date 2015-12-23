package vkx.baogia.utils;

import org.apache.struts2.ServletActionContext;
import org.hibernate.SessionFactory;

import vkx.baogia.constvar.BaoGiaConst;

public class HibernateUtils {
	public static SessionFactory sessionFactory;
	
	public static SessionFactory getInstance(){
		if(sessionFactory==null){
			sessionFactory = (SessionFactory) ServletActionContext.getServletContext()
		                     .getAttribute(BaoGiaConst.HIBERNATE_SESSION_KEYNAME);
		}
		return sessionFactory;
	}
}
