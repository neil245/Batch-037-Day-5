package com.blz.day5problems;
import java.util.Scanner;
public class Day5Problems {
	 public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number");
	        int n = sc.nextInt();
		 
	        int i = 0;               
	        int powerOfTwo = 1;       

	        
	        while (i <= n) {
	            System.out.println(i + " " + powerOfTwo);   
	            powerOfTwo = 2 * powerOfTwo;                
	            i = i + 1;
	        }

	    }
	}


