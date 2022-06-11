package com.statickey;
//static keyword
public class student {
	//instance variables
	int id;
	String name;
	//static variables
	static String collage="AIT";
	//constructor 
	student (int id,String name){
		this.id=id;
		this.name=name;
		
	}
	//method
	void display() {
		System.out.println(id+" "+name+" "+collage);
	}
	public static void main(String[] args) {
	   //object creating 
		student s=new student(101,"sanju");
		student s1=new student(102,"raju");
		//calling method
		s.display();
		s1.display();
	}

}
/*
101 sanju AIT
102 raju AIT
*/