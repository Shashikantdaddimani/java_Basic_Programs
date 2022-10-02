package com.javabasic.day6;

import java.util.Scanner;

public class TempretureConvertion {

	public static void main(String[]args) { 
		double f,c;
 	    Scanner sc=new Scanner(System.in);
 	    System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
        int ch=sc.nextInt();
        switch(ch)
	    {
	    case 1:  System.out.println("Enter  Fahrenheit temperature");
                   	  f=sc.nextDouble();
                 System.out.println("Celsius temperature is = "+celsius(f));
		  break;
	    case 2:  System.out.println("Enter  Celsius temperature");
                   	  c=sc.nextDouble();
	    	     System.out.println("Fahrenheit temperature is = "+fahrenheit(c));
		  break;
	   default:  System.out.println("please choose valid choice");
	   }  				
	}
	
	static double celsius(double f) {
		return (f-32)*5/9;
	}
	static double fahrenheit(double c)
	{	
	return  ((9*c)/5)+32;
	}
}
