package com.interfacedemo3;

public class Babu implements Reader,write {
public void myRead() {
	System.out.println("babu good at reading comics");
}
public void myWrite() {
	System.out.println("babu good at writing letter");
}
public static void main(String[] args) {
	Babu b=new Babu();
	b.myRead();
	b.myWrite();
}
}
