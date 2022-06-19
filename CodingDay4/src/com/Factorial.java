package com;

import java.util.Scanner;

//write program to print the factorial of the  number
public class Factorial {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	//enter the number
	int n=scan.nextInt();
	int fac=1;
	for(int i=1;i<=n;i++) {
		fac=fac*i;
	}
	System.out.println("factorial " +n+ " is "+fac);
}
}
//output 
//6
//factorial 6 is 720
