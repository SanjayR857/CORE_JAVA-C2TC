package com.Predicttheoutput;

public class Code5 {
public static void main(String[] args) {
	String s1="this is the example";
	int index =s1.indexOf("example",10);
	System.out.println(index);
	index =s1.indexOf("example",20);
	System.out.println(index);
}
}
//output 
//12
//-1