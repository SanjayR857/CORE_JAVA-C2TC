package com.abstractclass1;
abstract class Base{
	void fun() {
		System.out.println("Abstract class method");
	}
}
class sound extends Base{
	
}

public class Demo8 {
public static void main(String[] args) {
	sound s=new sound();
	s.fun();
}
}
/*
Abstract class method
*/