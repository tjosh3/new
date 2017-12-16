package com.sapient.client;

import java.util.ResourceBundle;

import com.sapient.service.Employee;
import com.sapient.util.SapUtil;

public class Sales {

	public static final String UNAME;
	public static final String PWD;
	static {
		ResourceBundle rb=ResourceBundle.getBundle("sap");
		UNAME=rb.getString("uname");
		PWD=rb.getString("pwd");
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(100, "tarun", 120000.2);
		emp1.display();
		Employee emp2 = new Employee(101, "shikhar", 11000.2);
		emp2.display();
		Employee emp3 = new Employee(102, "pandit", 1200.2);
		emp3.display();
		System.out.println(UNAME+" "+PWD);
		System.out.println("total employee " + Employee.totalEmployees);
		System.out.println("total sales " + SapUtil.roundUp2Dec((Employee.totalSales)));
	}

}
