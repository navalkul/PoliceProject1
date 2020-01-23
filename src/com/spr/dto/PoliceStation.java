package com.spr.dto;

public class PoliceStation {

	private int ps_Id;
	private String ps_Name;
	private String ps_Address;
	public int getPs_Id() {
		return ps_Id;
	}
	@Override
	public String toString() {
		return "PoliceStation [ps_Id=" + ps_Id + ", ps_Name=" + ps_Name + ", ps_Address=" + ps_Address + "]";
	}
	public void setPs_Id(int ps_Id) {
		this.ps_Id = ps_Id;
	}
	public String getPs_Name() {
		return ps_Name;
	}
	public void setPs_Name(String ps_Name) {
		this.ps_Name = ps_Name;
	}
	public String getPs_Address() {
		return ps_Address;
	}
	public void setPs_Address(String ps_Address) {
		this.ps_Address = ps_Address;
	}

	
	
}
