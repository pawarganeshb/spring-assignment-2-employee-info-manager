package com.information;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		BeanFactory beanFactory = new FileSystemXmlApplicationContext("beans-config.xml");
		Employee employee1 = (Employee) beanFactory.getBean("employee");
		System.out.println("Employee ID: " + employee1.getEmpId());
		System.out.println("Employee Name: " + employee1.getEmpName());
		System.out.println("Employee Salary: " + employee1.getEmpsalary());
		System.out.println("Employee City: " + employee1.getEmpAddress().getCity());
		System.out.println("Employee State: " + employee1.getEmpAddress().getState());
		System.out.println("Employee Pincode: " + employee1.getEmpAddress().getPincode());
		System.out.println("Employee Organization Name:" + employee1.getEmpOrganization().getOrgName());
		System.out.println("**************************************************************");
		Employee employee2 = (Employee) beanFactory.getBean("cEmployee");
		System.out.println("Employee ID: " + employee2.getEmpId());
		System.out.println("Employee Name: " + employee2.getEmpName());
		System.out.println("Employee Salary: " + employee2.getEmpsalary());
		System.out.println("Employee City: " + employee2.getEmpAddress().getCity());
		System.out.println("Employee State: " + employee2.getEmpAddress().getState());
		System.out.println("Employee Pincode: " + employee2.getEmpAddress().getPincode());
		System.out.println("Employee Organization Name:" + employee2.getEmpOrganization().getOrgName());
	}

}
