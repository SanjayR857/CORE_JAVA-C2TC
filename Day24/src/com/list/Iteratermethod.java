package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteratermethod {
public static void main(String[] args) {
	List<Integer> val=new ArrayList<>();
	val.add(34);
	val.add(89);
	val.add(23);
	Iterator z=val.iterator();
	while(z.hasNext()) {
		System.out.println(z.next());
	}
		System.out.println("ArrayList:"+val);
	
}
}
/*
34
89
23
ArrayList:[34, 89, 23]
*/
