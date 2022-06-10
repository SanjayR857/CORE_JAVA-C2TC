package com.thiskeyword;

public class Hello {
//constructor 
	Hello(){
		this(4);
		System.out.println("I like it");
	}
	//constructor
	Hello(int x){
		System.out.println("how many candy u want:"+x);
	}
	public static void main(String[] args) {
		//object creating
		Hello h=new Hello();
		
	}
}
/*
how many candy u want:4
I like it
*/