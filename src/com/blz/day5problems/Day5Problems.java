package com.blz.day5problems;
import java.util.Scanner;
public class Day5Problems {
	 public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number");
	        int n = sc.nextInt();
	        for(int i = 1 ; i <= n; i++) {
	        	if(i<n) {
	        		System.out.printf("1/%d + ",i);
	        	}
	        	else
	        	System.out.printf("1/%d ",i);
	        }
	       
	        }
	       
	    }
	


