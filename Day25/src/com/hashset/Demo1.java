package com.hashset;
import java.util.*;
public class Demo1 {
public static void main(String[] args) {
	Set list=new HashSet<>();
	list.add("java");
	list.add("technology");
	list.add("java");
	list.add(100);
	list.add(24.56);
	list.add("Bat");
	System.out.println(list);
}
}
//[java, 100, technology, 24.56]
