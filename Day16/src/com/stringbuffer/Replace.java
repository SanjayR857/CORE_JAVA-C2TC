package com.stringbuffer;

public class Replace {
public static void main(String[] args) {
	StringBuffer str=new StringBuffer("hello ");
	str.replace(1, 3, "java");
	System.out.println(str);
}
}
//hjavalo