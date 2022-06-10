package com.thiskeyword;
//invoke method using this  keyword
public class Demo {
	//constructor without par
    Demo(){
    	System.out.println("hello this ");
    }
    //constructor with par
    Demo(int x){
    	//this keyword to call Demo():
    	this();
    	System.out.println(x);
    }
    public static void main(String[] args) {
    	//object creating
		Demo d=new Demo(23);
		
	}
}
/*
 hello this 
23
*/
