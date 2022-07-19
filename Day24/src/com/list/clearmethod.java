package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class clearmethod {
public static void main(String[] args) {
	List<String> val=new ArrayList<>();
	val.add("java");
	val.add("is");
    val.add("Intersting");
    Iterator z=val.iterator();
    while(z.hasNext()) {
    	System.out.println(z.next());
    }
    val.clear();
    System.out.println(val);
    System.out.println(val.contains(val));
}
}
/*
java
is
Intersting
[]
flase
*/