package com.map;
import java.util.*;
public class Demo7 {
public static void main(String[] args) {
	Map<Integer,String> obj=new HashMap<Integer,String>();
	obj.put(1,"one");
	obj.put(2, "two");
	obj.put(3, "three");
	obj.put(null, "seven");
	obj.put(null, "six");
	obj.put(7, null);
System.out.println(obj);
}
}
