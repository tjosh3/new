package com.sapient.service;

import com.sapient.util.SapUtil;

public class Employee {
	private int id;
	private String name;
	private double sales;
	public static double totalSales;
	public static int totalEmployees;

	public Employee(int id, String name, double sales) {
		this.id = id;
		this.name = name;
		this.sales = sales;
		totalSales += this.sales;
		totalEmployees++;
	}

	public double calSalesComission() {
		double sc;
		if (sales >= 50000)
			sc = .1 * sales;
		else if (sales >= 2000 && sales < 50000)
			sc = .05 * sales;
		else
			sc = .03 * sales;
		return sc;
	}

	public void display() {
		System.out.println(
				id + " " + name + " " + SapUtil.roundUp2Dec(sales) + " " + SapUtil.roundUp2Dec(calSalesComission()));
	}
}
