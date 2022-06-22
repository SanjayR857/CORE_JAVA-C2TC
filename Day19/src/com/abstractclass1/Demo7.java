package com.abstractclass1;
abstract class Animal2{
	abstract void sound();
}
class Demo7 extends Animal2 {
	void sound() {
		System.out.println("Roar");
	}
public static void main(String[] args) {
	Animal2 a=new Demo7();
	a.sound();
}
}
/*
Roar
*/