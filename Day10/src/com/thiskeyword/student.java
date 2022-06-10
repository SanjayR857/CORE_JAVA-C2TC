package com.thiskeyword;
//using this keyword
public class student {
//instance variables
	String id;
	String name;
	float fees;
	//constructor and this keyword
	student(String id,String name,float fees){
		this.id=id;
		this.name=name;
		this.fees=fees;
		
	}
	//method
	void display() {
		System.out.println("USN:"+id+"\name:"+name+"\nfees:"+fees);
	}
	public static void main(String[] args) {
		//object creating
		student s=new student("1ay18me065","sanjay",35470);
		//calling method
		s.display();
	}
}
/*
USN:1ay18me065
name:sanjay
fees:35470.0
*/