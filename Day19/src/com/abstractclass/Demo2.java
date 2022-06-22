package com.abstractclass;

abstract class Bike1{
	abstract void run();
}

class Honda1 extends Bike1{
	void run() {
		System.out.println("petrol to run bike");
	}
}

class Ola extends Bike1 {
	void run() {
		System.out.println("power to run bike");
	}
}

public class Demo2 {
public static void main(String[] args) {
	Honda1 s=new Honda1();
	Ola a=new Ola();
	s.run();
	a.run();
}
}
