package com.sapient.service;

public class Car {
	private int carId;
	private String carName;
	private double carPrice;

	public Car(int carId) {
		super();
		System.out.println("one arg constructor");
		this.carId = carId;
	}

	public Car(int carId, String carName) {
		this(carId);
		System.out.println("two arg constructor");
		this.carName = carName;
	}

	public Car(int carId, String carName, double carPrice) {
		this(carId, carName);
		System.out.println("three arg constructor");
		this.carPrice = carPrice;
	}

	public void display(){
		System.out.println(carId + " "carName + " " + carPrice);
	}
}
