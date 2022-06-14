package com.wrapper;

public class AutoBoxing {
public static void main(String[] args) {
	int i=5;
	Integer j=Integer.valueOf(5);
	Integer k=i;
	System.out.println("i: "+i+" j: "+j+" k: "+k);
}
}
/*
output
i: 5 j: 5 k: 5
*/