package com.constructor;

public class sample1 {
//instance variables
	int id;
	double sal;
	//constructor
	sample1(){
		
	}
	//method 
	public void display() {
		System.out.println("id:"+id+"\nsal:"+sal);
	}


	public static void main(String[] args) {
		sample1 s=new sample1();
		s.display();
	}
}
	

