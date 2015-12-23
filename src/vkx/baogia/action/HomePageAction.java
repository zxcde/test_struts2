package vkx.baogia.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import vkx.baogia.constvar.BaoGiaConst;
import vkx.baogia.dao.JobDAO;
import vkx.baogia.model.Job;

@SuppressWarnings("serial")
public class HomePageAction extends ActionSupport {
	public List<Job> jobs;
	
	@Action(value = "home", 
			results = { @Result(name = "success", location = BaoGiaConst.prefix+"index.jsp")})
	public String home() {
		jobs = JobDAO.getInstance().getAllJob();
		System.out.println("AAAA: "+jobs.size());
		return "success";
	}
	
	@Action(value = "welcome", 
			results = { @Result(name = "success", location = BaoGiaConst.prefix+"index.jsp")})
	public String welcome() {
		return "success";
	}

	/*public List<Job> getJobs() {
		return jobs;
	}

	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}*/
	
}
