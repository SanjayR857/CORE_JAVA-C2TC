package com.wrapper;

public class UnBoxing {
public static void main(String[] args) {
	Integer i=(7);
	int a=i;
	int k=i.intValue();
	System.out.println("i: " +i+" a: "+a+" K: "+k);
}
}
/*
output
i: 7 a: 7 K: 7
*/