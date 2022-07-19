package com.hashset;

import java.util.LinkedHashSet;

public class Demo5 {
public static void main(String[] args) {
	LinkedHashSet<String> list=new LinkedHashSet<>();
	list.add("apple");
	list.add("banana");
	list.add("orange");
	list.add("lemon");
	System.out.println(list);
	Object[] arr=list.toArray();
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	
}
}
/*
[apple, banana, orange, lemon]
apple
banana
orange
lemon
*/