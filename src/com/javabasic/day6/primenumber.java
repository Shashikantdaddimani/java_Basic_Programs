package com.javabasic.day6;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		boolean flag =false;
		if(n==0 || n==1)
		{
			System.out.println("not prime numbers.");
		}
		else
		{
			for(int i = 2; i<=n/2;i++) {
			if(n%i==0) {
				flag = true;
//				System.out.println(" not Prime numbers.");
			}
			}
		}
		if(!flag) {
			System.out.println("Prime numbers.");
		}else
		{
			System.out.println("Not a prime numbers.");
		}
		
		
		
		
	}

}
