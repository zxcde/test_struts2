package vkx.baogia.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import vkx.baogia.constvar.BaoGiaConst;

@SuppressWarnings("serial")
public class BaoGiaAction extends ActionSupport{
	@Action(value = "baogia", 
			results = { @Result(name = "success", location = BaoGiaConst.prefix_baogia+"baogia.jsp")})
	public String baogia() {
		return "success";
	}
}
