package com.list;
import java.util.*;
public class Demo4 {
public static void main(String[] args) {
	List list=new ArrayList<>();
	list.add(10);
	list.add(30);
	list.add(40);
	list.add(34);
	System.out.println(list.get(3));
	list.set(2,00);
	System.out.println(list);
	System.out.println(list.isEmpty());
}
}
/*
34
[10, 30, 0, 34]
false
*/