package com;

public class Index {
public static void main(String[] args) {
	String str="sanjay is like to code";
	int index1=str.indexOf('j');
	System.out.println("index 1:j is"+index1);
	int index2=str.indexOf("code");
	System.out.println("index 2: code "+index2);
	int index3=str.indexOf("is",4);
	System.out.println("index3: is "+index3);
}
}
/* output
index 1:j is3
index 2: code 18
index3: is 7
*/