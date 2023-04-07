package com.tta;

import java.util.Scanner;

public class Pratice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the value of x: ");
		double x = scanner.nextDouble();
		
		System.out.println("enter the value of y: ");
		double y = scanner.nextDouble();
		
		System.out.println("enter the value of z: ");
		double z = scanner.nextDouble();
		
		double result = 0;
		result = Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
		System.out.println(result);
		scanner.close();
		
		
		
		
	}
	
	

}
