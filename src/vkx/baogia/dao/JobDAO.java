package vkx.baogia.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import vkx.baogia.model.Job;
import vkx.baogia.utils.HibernateUtils;

public class JobDAO {
	public static JobDAO jobDAO;
	
	public static JobDAO getInstance(){
		if(jobDAO==null) jobDAO = new JobDAO();
		return jobDAO;
	}
	
	public List<Job> getAllJob(){
		Session session = HibernateUtils.getInstance().getCurrentSession();
		List<Job> listJob = null;
		try {
			session.getTransaction().begin();
			String hql = "FROM Job";
			listJob = session.createQuery(hql).list();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		return listJob;
	}
	
	public int addJob(Job job){
		Session session = HibernateUtils.getInstance().getCurrentSession();
		int result = 0;
		try {
			session.getTransaction().begin();
			String sql = "insert into job(job_name, job_desc) values (:job_name, :job_desc)";
			Query query = session.createSQLQuery(sql)
					.setParameter("job_name", job.getJobName())
					.setParameter("job_desc", job.getJobDesc());
			result = query.executeUpdate();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		return result;
	}
	
}
