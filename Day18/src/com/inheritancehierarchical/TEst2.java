package com.inheritancehierarchical;

public class TEst2 {
public static void main(String[] args) {
	Car c=new Car();
	bike b=new bike();
	c.brand();
	c.start();
	b.brand();
	b.stop();
}
}
/*
brand
car started
brand
bike stopped
*/