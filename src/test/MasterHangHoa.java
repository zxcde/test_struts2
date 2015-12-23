package test;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import vkx.baogia.utils.StringUtil;

public class MasterHangHoa {
	private boolean chon;
	private String phanloai, ten, quycach, donvi;
	private int nguyengia;
	private boolean loaibo;
	
	public MasterHangHoa() {}

	public MasterHangHoa(boolean chon, String phanloai, String ten, String quycach, String donvi, int nguyengia,
			boolean loaibo) {
		super();
		this.chon = chon;
		this.phanloai = phanloai;
		this.ten = ten;
		this.quycach = quycach;
		this.donvi = donvi;
		this.nguyengia = nguyengia;
		this.loaibo = loaibo;
	}

	public String getPhanloai() {
		return phanloai;
	}

	public void setPhanloai(String phanloai) {
		this.phanloai = phanloai;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getQuycach() {
		return quycach;
	}

	public void setQuycach(String quycach) {
		this.quycach = quycach;
	}

	public String getDonvi() {
		return donvi;
	}

	public void setDonvi(String donvi) {
		this.donvi = donvi;
	}

	public int getNguyengia() {
		return nguyengia;
	}

	public void setNguyengia(int nguyengia) {
		this.nguyengia = nguyengia;
	}
	
	public boolean isChon() {
		return chon;
	}

	public void setChon(boolean chon) {
		this.chon = chon;
	}

	public boolean isLoaibo() {
		return loaibo;
	}

	public void setLoaibo(boolean loaibo) {
		this.loaibo = loaibo;
	}

	public static int compare(MasterHangHoa m1, MasterHangHoa m2){
		int ss1 = StringUtil.compare(m1.getPhanloai(), m2.getPhanloai());
		if(ss1!=0) return ss1;
		
		int ss2 = StringUtil.compare(m1.getTen(), m2.getTen());
		if(ss2!=0) return ss2;
		
		int ss3 = StringUtil.compare(m1.getQuycach(), m2.getQuycach());
		if(ss3!=0) return ss3;
		
		int ss4 = StringUtil.compare(m1.getDonvi(), m2.getDonvi());
		if(ss4!=0) return ss4;
		
		int ng1 = m1.getNguyengia();
		int ng2 = m2.getNguyengia();
		if(ng1<ng2) return -1;
		else if(ng1>ng2) return 1;
		
		return 0;
	}
	
	@SuppressWarnings("unchecked")
	public static List<MasterHangHoa> getMasterHangHoasFromRequest(HttpServletRequest request, String key){
		List<MasterHangHoa> listMHHs = null;
		try {
			listMHHs = (List<MasterHangHoa>) request.getAttribute(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(listMHHs==null) listMHHs = new ArrayList<>();
		return listMHHs;
	}
	
}
