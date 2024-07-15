package com.information;

public class Employee {
	private String empName;
	private String empId;
	private int empsalary;
	private Address empAddress;
	private Organization empOrganization;

	public Employee(String empName, String empId, int empsalary, Address empAddress, Organization empOrganization) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empsalary = empsalary;
		this.empAddress = empAddress;
		this.empOrganization = empOrganization;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpId() {
		return empId;
	}

	public int getEmpsalary() {
		return empsalary;
	}

	public Address getEmpAddress() {
		return empAddress;
	}

	public Organization getEmpOrganization() {
		return empOrganization;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public void setEmpsalary(int empsalary) {
		this.empsalary = empsalary;
	}

	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}

	public void setEmpOrganization(Organization empOrganization) {
		this.empOrganization = empOrganization;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empsalary=" + empsalary + ", empAddress="
				+ empAddress + ", empOrganization=" + empOrganization + "]";
	}

}
