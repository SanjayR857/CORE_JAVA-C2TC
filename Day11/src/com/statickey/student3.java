package com.statickey;
//static method and block
public class student3 {
//instance variables
	int id;
	String name;
	static String college;
	//constructor
	student3(int id,String name){
		this.id=id;
		this.name=name;
	}
	//static block
	static {
		college="AIT";
	}
	//static method
	static void change() {
		college="BBTC";
	}
	//method
	void display() {
		System.out.println(id+" "+name+" "+college);
	}
	public static void main(String[] args) {
		//object creating 
		student3 s=new student3(101,"girish");
		//calling method
		s.display();
		//calling static to change
		s.change();
		//then calling method 
		s.display();
	}
}
/*
101 girish AIT
101 girish BBTC
*/
