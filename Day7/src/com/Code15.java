package com;
//switch Case in java
public class Code15 {
public static void main(String[] args) {
	{
		char x = 'F';
		switch (x) 
		{
		case 'a' : 
		case 'A' : 
			System.out.println("The value of x is a");
			break;
		case 'b':
		case 'B' :
			System.out.println("The value of x is b");
			break;
		case 'c':
		case 'C' :	
			System.out.println("The value of x is c");
			break;
		default:
	System.out.println("The value of x is other than a,b,c");
			break;
		}
	}
	String name = "te";

	switch (name.toLowerCase()) 
	{
	case "author":
		System.out.println("Vikas");
		break;
	case "team":
		System.out.println("Team Java Full Stack");
		break;
	case "editor":
		System.out.println("Vishnu & Krishna");
		break;
	default:
		System.out.println("Invalid entry");
		break;
}
}

}

//output
//1.The value of x is other than a,b,c
//2.Invalid entry