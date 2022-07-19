package com.LinkedList;
import java.util.*;
public class Demo2remove {
public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<String>();
	list.add("ajay");
	list.add("madhu");
	list.add("ajay");
	list.add("varun");
	list.add("sachin");
	list.add("ajay");
	System.out.println("list "+list);
	list.remove(3);
	System.out.println("list after remove 3"+list);
	list.removeFirst();
	System.out.println("remove first "+list);
	list.removeLast();
	System.out.println("remove last "+list);
	list.add("ajay");
	System.out.println(list);
	list.removeFirstOccurrence("ajay");
	System.out.println(list);
}
}
/*
list [ajay, madhu, ajay, varun, sachin, ajay]
list after remove 3[ajay, madhu, ajay, sachin, ajay]
remove first [madhu, ajay, sachin, ajay]
remove last [madhu, ajay, sachin]
[madhu, ajay, sachin, ajay]
[madhu, sachin, ajay]
*/