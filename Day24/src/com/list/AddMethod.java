package com.list;

import java.util.ArrayList;
import java.util.List;

public class AddMethod {
public static void main(String[] args) {
	List<Integer> l=new ArrayList<>();
	l.add(100);
	l.add(46);
	l.add(300);
	l.add(30);
	for(Integer e:l) {
		System.out.println(e);
	}
	System.out.println("ArrayList: "+l);
}
}
/*
100
46
300
30
ArrayList: [100, 46, 300, 30]
*/