package com.stringbuffer;

public class Delect {
public static void main(String[] args) {
	StringBuffer str=new StringBuffer("Hello ");
		str.delete(1, 3);
		System.out.println(str);
}
}
//Hlo