package com.list;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
  public static void main(String[] args) {
	List val=new ArrayList<>();
	val.add(234);
	val.add(100);
	val.add("webner");
	val.add(234);
	System.out.println(val);
	int num=val.size();
	System.out.println("index of list: "+num);
	List val2=val.subList(1, 3);
	System.out.println("sublist "+val2);
	val.removeAll(val);
	System.out.println(val);
	
}
}
/*[234, 100, webner, 234]
index of list: 4
sublist [100, webner]
[]
*/