package com.hashset;

import java.util.*;

public class Demo2 {
public static void main(String[] args) {
	Set list=new LinkedHashSet<>();
	list.add(24);
	list.add(34);
	list.add(45);
	list.add(12);
	list.add(12);
	System.out.println(list);
}
}
