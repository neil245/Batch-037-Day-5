package com.blz.day5problems;
import java.util.Scanner;
public class Day5Problems {
	 public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);
	        char ch ;
	        System.out.println("Enter an alphabet");
	        ch = sc.next().charAt(0);
	        System.out.println(ch);
	        if(ch=='a' || ch == 'e' ||ch =='i'|| ch=='o' || ch =='u' || ch=='A' || ch=='E'  || ch=='I' || ch=='O' || ch =='U') {
	        	System.out.println("The entered character is a vowel");
	        }
	        else {
	        	System.out.println("The entered character is consonant");
	        }
	       
	        }
	       
	    }
	


