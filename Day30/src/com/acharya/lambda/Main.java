package com.acharya.lambda;
 interface Sayable {
public  void say();
}
 public class Main {
	public static void main(String[] args) {
		Sayable s=()->{System.out.println("I have nothing to say");};
		s.say();
	}
}

