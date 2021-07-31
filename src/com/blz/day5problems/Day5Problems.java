package com.blz.day5problems;
import java.util.Scanner;
public class Day5Problems {
	 public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a dividend");
	        int n = sc.nextInt();
	       System.out.println("The dividend is "+n);
	       System.out.println("Enter divisor");
	       int div = sc.nextInt();
	       float quotient = n/div;
	       int reminder = n%div;
	       System.out.printf("The quotient is "+quotient);
	       System.out.println("The reminder is "+reminder);
	       
	       
	        }
	       
	    }
	


