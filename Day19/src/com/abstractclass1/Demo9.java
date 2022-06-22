package com.abstractclass1;
abstract class A{
abstract void abstract_method();
public void normal() {
	System.out.println("i am superman");
}
}
class B extends A{
	void abstract_method() {
		System.out.println(" i am Ironman");
	}
}
public class Demo9 {
public static void main(String[] args) {
	B b=new B();
	b.abstract_method();
	b.normal();
}
}
/*
i am Ironman
i am superman
*/