package com.javabasic.day6;

import java.util.Scanner;

public class SqrtNewtonMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		double c = sc.nextDouble();
		
		 double epsilon = 1e-15; 
		 double t = c; 
		
		 while (Math.abs(t - c/t) > epsilon*t) 
		 {
	            t = (c/t + t) / 2.0;
	     }
		   		System.out.println("the Sqrt of the entered Number is: "+t);
		
	}

}
