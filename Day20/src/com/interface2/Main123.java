package com.interface2;

public class Main123 implements Imlements1,Implements2{
	public void myMethod() {
		System.out.println("inherting two interface");
	}
	public static void main(String[] args) {
		Main123 obj=new Main123();
		obj.myMethod();
	}
}
