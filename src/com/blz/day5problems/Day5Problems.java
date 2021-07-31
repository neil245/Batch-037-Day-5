package com.blz.day5problems;
import java.util.Scanner;
public class Day5Problems {
	 public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number");
	        int n = sc.nextInt();
	       System.out.println("The number is : "+n);
	       for(int i=2;i<n;i++) {
	    	   if(n%i==0) {
	    		   int flag = 0;
	    		   
	    		   for(int j = 2;j<=i/2;j++) {
	    			   if(i%j==0) {
	    				   flag = 1;
	    				   break;
	    			   }
	    		   }
	    		   if(flag==0) {
	    			   System.out.println(i);
	    		   }
	    		   
	    	   }
	       }
	       
	        }
	       
	    }
	


