package com.thiskeyword;

public class Employee {
 Employee() {
	 this(4,6);
	 System.out.println("null");
	
}
 Employee(int x){
	 this();
	 System.out.println("x:"+x);
	 
 }
 Employee(int x,int y){
	 System.out.println("x and y is "+x+","+y);
	 
 }
 public static void main(String[] args) {
	Employee e1=new Employee(9);
	}
}
/*
x and y is 4,6
null
x:9
*/