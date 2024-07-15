package com.information;

public class Organization {
	private String orgName;
	private Address orgAddress;
	
	
	public Organization(String orgName, Address orgAddress) {
		super();
		this.orgName = orgName;
		this.orgAddress = orgAddress;
	}
	public Organization() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getOrgName() {
		return orgName;
	}
	public Address getOrgAddress() {
		return orgAddress;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public void setOrgAddress(Address orgAddress) {
		this.orgAddress = orgAddress;
	}
	@Override
	public String toString() {
		return "Oranization [orgName=" + orgName + ", orgAddress=" + orgAddress + "]";
	}

}
