package com.interface1;

public interface Main {
 int i=10;
 static void display() {
	 System.out.println("static method");
 }
}
class Nli implements Main{
	public static void main(String[] args) {
		Main.display();
	}
}