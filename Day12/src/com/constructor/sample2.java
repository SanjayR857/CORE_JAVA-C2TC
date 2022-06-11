package com.constructor;

public class sample2 {
	String name;
	int id;
	double sal;
	//constructor parameterized
	sample2(String name,int id,double sal){
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	//method
	void display() {
		System.out.println(name+" "+id+" "+sal);
	}
	public static void main(String[] args) {
		//object creating
		sample2 s1=new sample2("sanjay",101,10000);
		sample2 s2=new sample2("tom",202,20000);
		//calling method display
		s1.display();
		s2.display();
	}
}
/*
sanjay 101 10000.0
tom 202 20000.0
*/