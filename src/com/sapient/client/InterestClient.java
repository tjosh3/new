package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Interest;

public class InterestClient {
	public static void main(String[] args) {
		Interest interest = new Interest();
		interest.amt = 100.2;
		interest.rate = 10.75f;
		interest.years = 4;
		interest.calcSimple();
		interest.calcCompund();
		Interest interest2 = new Interest();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount");
		double amount = sc.nextDouble();
		System.out.println("Enter the years");
		int years = sc.nextInt();
		System.out.println("Enter the rate");
		float rate = sc.nextFloat();
		interest2.amt = amount;
		interest2.rate = rate;
		interest2.years = years;
		System.out.println("Simple interest is " + interest2.calcSimple());
		System.out.println("Compund interest is " + interest2.calcCompund());
		sc.close();
	}
}
