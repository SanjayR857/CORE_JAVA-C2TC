package com.stringbuffer;

public class EnsureCapacity {
public static void main(String[] args) {
	StringBuffer str=new StringBuffer();
	System.out.println(str.capacity());
	str.append("Hello");
	System.out.println(str.capacity());
	str.append("java is high level lang");
    str.ensureCapacity(10);
    System.out.println(str.capacity());
	str.ensureCapacity(50);
	System.out.println(str.capacity());
}
}
/*
16
16
34
70
*/