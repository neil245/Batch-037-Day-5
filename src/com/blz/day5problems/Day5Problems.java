package com.blz.day5problems;
import java.util.Scanner;
import java.io.*;
public class Day5Problems {
	 public static void main(String[] args) {
		int[][] arr = new int[5][5];
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the number of rows");
	 int row = sc.nextInt();
	 System.out.println("Enter the number of columns");
	 int col = sc.nextInt();
	 for(int i=0;i<row;i++) {
		 for(int j=0;j<col;j++) {
			 System.out.println("Enter the "+i+j+" element");
			arr[i][j]  = sc.nextInt();
		 }
	 }
//	 for(int i=0;i<row;i++) {
//		 for(int j=0;j<col;j++) {
//			 System.out.print(arr[i][j]+" ");
//		 }
//		 System.out.println();
//	 
//	          }
	 PrintWriter pw = new PrintWriter(System.out);
//	 pw.print(arr);
//	 pw.flush();
	 for(int i=0;i<row;i++) {
		 for(int j=0;j<col;j++) {
	
			 pw.print(arr);
		 }
	System.out.println();
		
	 
	          }
	       
	    }
}
	


