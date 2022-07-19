package com.hashset;
import java.util.*;
public class Demo7 {
public static void main(String[] args) {
	SortedSet<Integer> set=new TreeSet<>();
	set.add(4);
	set.add(5);
	set.add(3);
	set.add(1);
	System.out.println(set);
}
}
//[1, 3, 4, 5]