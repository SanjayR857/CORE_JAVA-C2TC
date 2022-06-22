package com.abstractclass;

abstract class Bike{
	
	abstract void run();
}
class Honda extends Bike {	
	void run() {
		
		System.out.println("bike is running");
	
}


public class Demo1 {
	
public static void main(String[] args) {
	
	Honda s=new Honda();
	s.run();
}
}
}
