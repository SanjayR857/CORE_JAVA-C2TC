package com.stringbuffer;

public class Capacity {
public static void main(String[] args) {
	StringBuffer str=new StringBuffer();
	System.out.println(str.capacity());
	str.append("hello");
	System.out.println(str.capacity());
	str.append("is java is high level lang");
	System.out.println(str.capacity());
}
}
/*
16
16
34
*/