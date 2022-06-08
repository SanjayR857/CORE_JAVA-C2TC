package com;

import java.util.Scanner;

public class calculater {
	public static void main(String[] args) {
		
	Scanner input=new Scanner(System.in);
	System.out.println("enter the number a:");
	double a=input.nextDouble();
	System.out.println("enter the number b:");
	double b=input.nextDouble();
	System.out.println("enter the type of operater");
	char c=input.next().charAt(0);
	switch(c){
	case ('+'): System.out.println(a+b);
	break;
	case ('*'): System.out.println(a*b);
	break;
	case ('-'): System.out.println(a-b);
	break;
	case ('/'): System.out.println(a/b);
	break;
	default:System.out.println("invalid operater");
		
	}
}
}
