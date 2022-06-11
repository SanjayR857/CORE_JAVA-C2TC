package com.constructor;
//one constructor calling other constructor 
public class sample3 {

   public sample3() {
this(5);
System.out.println("this is zero arg constr");
}
   public sample3(int a) {
	   System.out.println("this is int a constr");
   }
}
class test{
	public static void main(String[] args) {
		sample3 s=new sample3();
	}
}
/*
this is int  a constr
this is zero arg constr
*/