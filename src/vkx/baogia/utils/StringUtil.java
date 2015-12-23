package vkx.baogia.utils;

public class StringUtil {
	public static int compare(String s1, String s2){
		int rs = s1.trim().compareTo(s2.trim());
		if(rs>0) return 1;
		else if(rs<0) return -1;
		else return 0;
	}
}
