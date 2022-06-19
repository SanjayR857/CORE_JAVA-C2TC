package com;

import java.util.Scanner;

// to print 1 3 4 6 7 9.....
public class Pattern1 {
public static void main(String[] args) {
 Scanner str=new Scanner(System.in);
 //enter the number of loop
 int n=str.nextInt();
 int a=1;
 System.out.print(a+" ");
 int b=3;
 System.out.print(b+" ");
 for(int i=3;i<=n;i++) {
	 if(i%2==1) {
		 a=a+3;
		 System.out.print(a+" ");
	 }
	 else {
		 b=b+3;
		 System.out.print(b+" ");
	 }
 }
}
}
//output 1 3 4 6 7 9