package com.LinkedList;
import java.util.*;
public class Demo1Add {
public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<String>();
	list.add("ajay");
	list.add("madhu");
	list.add("varun");
	list.add("sachin");
	System.out.println("list "+list);
	list.add(1,"babu");
	System.out.println("list after add "+list);
	list.addFirst("sanjay");
	System.out.println("list after addfirst "+list);
	list.addLast("manjo");
	System.out.println("list after addLast "+list);
	
}
}
/*
list [ajay, madhu, varun, sachin]
list after add [ajay, babu, madhu, varun, sachin]
list after addfirst [sanjay, ajay, babu, madhu, varun, sachin]
list after addLast [sanjay, ajay, babu, madhu, varun, sachin, manjo]
*/