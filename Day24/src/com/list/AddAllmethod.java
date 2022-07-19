package com.list;

import java.util.ArrayList;
import java.util.List;

public class AddAllmethod {
public static void main(String[] args) {
	List<String> val1=new ArrayList<>();
	val1.add("hello i am ");
	List<String> val2=new ArrayList<>();
	val2.add("here today");
	val1.addAll(val2);
	System.out.println(val1);
}
}
/*
[hello i am , here today]
*/