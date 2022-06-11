package com.thiskeyword;
//default value
public class Demo2 {
//instance variables
	int id;
	String name;
	double sal;
	
 //constructor
	Demo2(int id,String name,double sal){
		id=id;
		name=name;
		sal=sal;
	}
	//method 
	void display() {
		System.out.println(id+" "+name+" "+sal);
	}
	public static void main(String[] args) {
		//object creating
		Demo2 d=new Demo2(1234,"sahana",3456);
		//calling method
		d.display();
	}
}
/*
0 null 0.0
*/