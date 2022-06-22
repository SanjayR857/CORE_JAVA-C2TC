package com.abstractclass1;

abstract class Bike2{
	Bike2(){
		System.out.println("Bike is created");
	}
	abstract void run();
	void gearchange() {
		System.out.println("change the gear");
	}
}
class honda extends Bike2{
	void run(){
		System.out.println("start the bike");
	}
}

public class Demo4 {
public static void main(String[] args) {
	honda h=new honda();
	h.run();
	h.gearchange();
}
}
/*
Bike is created
start the bike
change the gear
*/
