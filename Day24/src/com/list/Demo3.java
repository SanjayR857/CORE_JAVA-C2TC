package com.list;
import java.util.*;
import java.util.ArrayList;

public class Demo3 {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<Integer>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(10);
	int num=list.indexOf(10);
	System.out.println("index of "+num);
	int num2=list.lastIndexOf(10);
	System.out.println("last index of "+num);
	System.out.println("fillmethod before use "+list);
	Collections.fill(list,5);
	System.out.println("fill method after use "+list);
}
}
/*
index of 0
last index of 3
fill method before use [10, 20, 30, 10]
fill method after use [5, 5, 5, 5]
*/