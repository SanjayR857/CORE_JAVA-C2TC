package com.acharya.lambda;
interface Lamdba{
	public void demo();
}
public class mutiThread {
public static void main(String[] args) {
	new Thread(()->{System.out.println("I am run method ");}).start();
}
}

