package com.scan;

import java.util.Scanner;

public class Demo1 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number to countdigit");
	int i=scan.nextInt();
	int count=0;
	while(i!=0) {
		i=i/10;
		count++;
	}
	System.out.println("they have "+count+" digits");
}
}
/*
enter the number to countdigit
235243
they have 6 digits
*/