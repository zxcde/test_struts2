package vkx.baogia.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import com.opensymphony.xwork2.ActionSupport;

import vkx.baogia.constvar.BaoGiaConst;

@SuppressWarnings("serial")
public class MasterHangHoaAction extends ActionSupport{
	
	@Action(value = "masterHangHoa", 
			results = { @Result(name = "success", location = BaoGiaConst.prefix_masterHangHoa+"masterHangHoa.jsp")})
	public String masterHangHoa() {
		return "success";
	}
	
}
