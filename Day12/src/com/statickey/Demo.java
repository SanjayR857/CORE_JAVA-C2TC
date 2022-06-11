package com.statickey;

public class Demo {
	//static block
 static {
	 System.out.println("i am the one will print first raju");
 }
 //static method
 static void display() {
	 System.out.println("u not i will print first babu");
 }
 //method
 void main() {
	 System.out.println("it is me that will print first manjunath");
 }
 //constructor
 Demo(){
	 System.out.println("hello everone goodbye first is me sanjay");
 }
 public static void main(String[] args) {
	System.out.println("i am in main method i will print first vikas");
	//object creating
	Demo d=new Demo();
	d.display();
	d.main();
}
 //static block
 static {
	 System.out.println("hello i am in last but i will print first sanjana");
 }
}
/*
i am the one will print first raju
hello i am in last but i will print first sanjana
i am in main method i will print first vikas
hello everone goodbye first is me sanjay
u not i will print first babu
it is me that will print first manjunath
*/