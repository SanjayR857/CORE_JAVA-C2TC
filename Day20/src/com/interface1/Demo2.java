package com.interface1;

public interface Demo2 {
public void method1();
}
class Demo1 implements Demo2 {
	public void method1() {
	System.out.println("method1");
	}
public static void main(String[] args) {
	Demo1 obj=new Demo1();
	obj.method1();
}
}
