package com.javabasic.day6;

import java.util.Scanner;

public class FiboncciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number: ");
		int num = sc.nextInt();
		int firstTerm = 0;
		int secondTerm = 1;
		System.out.println("Fibonacci Series till " + num + " terms:");
		for(int i=1;i<=num;i++) {
			System.out.println(firstTerm + "  ");
			
	    int nextTerm = firstTerm + secondTerm;
		firstTerm = secondTerm;
		secondTerm = nextTerm;
		
		
		}
		
		
		
		
		
		
	}

}
