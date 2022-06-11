package com.thiskey;

public class sample {
//instance variables
	int i;
	double y1;
	//constructor
	public sample() {
		System.out.println("this is sample()");
	}
	//method
	public void test() {
		System.out.println("this"+this);
	}
	public static void main(String[] args) {
		sample s=new sample();
		sample s1=new sample();
		System.out.println("s"+s);
		s.test();
		System.out.println("s1"+s1);
		s1.test();
	}
}
