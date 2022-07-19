package com.list;

import java.util.ArrayList;
import java.util.List;

public class RemoveKey {
public static void main(String[] args) {
	List<Integer> val=new ArrayList<>();
	val.add(0);
	val.add(34);
	val.add(11);
	val.add(23);
	val.remove(2);
	System.out.println(val);
}
}
//[0, 34, 23]