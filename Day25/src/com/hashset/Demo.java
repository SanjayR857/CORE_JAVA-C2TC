package com.hashset;

import java.util.SortedSet;
import java.util.TreeSet;

public class Demo {
public static void main(String[] args) {
	SortedSet<String> set=new TreeSet<>();
	set.add("A");
	set.add("B");
	set.add("D");
	set.add("C");
	System.out.println(set);
}
}
/*
[A, B, C, D]
*/