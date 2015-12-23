package vkx.baogia.utils;

import com.opensymphony.xwork2.ActionContext;

public class SessionUtils {
	public static void put(String key, Object value){
		ActionContext.getContext().getSession().put(key,value);
	}
	
	public static void remove(String key){
		ActionContext.getContext().getSession().remove(key);
	}
}
