package com.LinkedList;

import java.util.LinkedList;

public class Demo5 {
public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<String>();
	list.add("ajay");
	list.add("madhu");
	list.add("ajay");
	list.add("varun");
	list.add("sachin");
	list.add("ajay");
	System.out.println("list "+list);
	System.out.println("list peek  "+list.peek());
}
}
