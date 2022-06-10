package com.constructor;

public class Employee {
//instance variables
	int id;
	String name;
	float salary;
	//constructor
	public Employee(int i,String n,float s) {
		id=i;
		name=n;
		salary=s;
	}
	//method
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}
	public static void main(String[] args) {
		//object creating 
		Employee E1=new Employee(102,"tom",9000);
		Employee E2=new Employee(202,"sanju",5000);
		//method calling
		E1.display();
		E2.display();
	}
	
}
/*
 102 tom 9000.0
202 sanju 5000.0
*/
