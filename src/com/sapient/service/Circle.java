package com.sapient.service;

public class Circle {

	public double radius;

	public double calArea() {
		double area = Math.PI * radius * radius;
		return area;
	}

	public double cal() {
		double circum = 2 * Math.PI * radius;
		return circum;
	}

}
