package com.blz.day5problems;

import java.util.Random;
import java.util.Scanner;

public class Day5Problems {
	public static void main(String[] args) {
		long year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year : ");
		year = sc.nextInt();
		if(year%4==0){
			if(year%100 ==0) {
				if(year%400 == 0) {
					System.out.println("It is a leap year");
				}
				else {
					System.out.println("It is not a leap year");
				}
				}
			else {
				System.out.println("It is not a leap year");
			}
		}
			else {
				System.out.println("It is not a leap year");
						
			}
			
							

		}
	}


