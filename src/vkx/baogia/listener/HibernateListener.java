package vkx.baogia.listener;

import java.net.URL;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import vkx.baogia.constvar.BaoGiaConst;

public class HibernateListener implements ServletContextListener{
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		URL url = HibernateListener.class.getResource("/hibernate.cfg.xml");
        Configuration config = new Configuration();
        config.configure(url);
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(config.getProperties()).build();
        SessionFactory sf = config.buildSessionFactory(serviceRegistry);
        sce.getServletContext().setAttribute(BaoGiaConst.HIBERNATE_SESSION_KEYNAME, sf);
	}

}
