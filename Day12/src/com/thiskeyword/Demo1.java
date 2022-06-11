package com.thiskeyword;

public class Demo1 {
//instance variables
	int id;
	String name;
	double sal;
	//constructor par
	Demo1(int id,String name,double sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	//method
	void display() {
		System.out.println(id+" "+name+" "+sal);
	}
	public static void main(String[] args) {
		//object creating 
		Demo1 d=new Demo1(123,"jerry",6596);
		Demo1 d1=new Demo1(234,"tom",4564);
		d.display();
		d1.display();
	}
}
/*
123 jerry 6596.0
234 tom 4564.0
*/