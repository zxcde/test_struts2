package vkx.baogia.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import vkx.baogia.dao.JobDAO;
import vkx.baogia.model.Job;

public class DoTestAction extends ActionSupport {
	public String job_name, job_desc;
	
	@Action(value = "doTest",
			results = { 
				@Result(name = "success", 
						type="redirectAction", 
						params = {"actionName", "home", "message", "success"}),
				@Result(name = "fail", 
						type="redirectAction", 
						params = {"actionName", "home", "message", "fail"}),
			})
	public String doTest() {
		Job job = new Job(job_name, job_desc);
		JobDAO jobDao = JobDAO.getInstance();
		int result = jobDao.addJob(job);
		if(result>0) return "success";
		else return "fail";
	}
}
