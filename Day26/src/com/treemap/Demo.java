package com.treemap;
import java.util.*;
public class Demo {
	public static void main(String[] args) {
	SortedMap<String, String> t1 = new TreeMap<String,String>();
	t1.put("Father", "Farmer");
	t1.put("Mother", "Teacher");
	t1.put("Son", "Engineer");
	t1.put("Daughter", "Doctor");
	t1.put("Cousin", "Manager");
	for(SortedMap.Entry m:t1.entrySet())

	{

	System.out.println(m.getKey()+" "+m.getValue());

	}
}
}
/*
Cousin Manager
Daughter Doctor
Father Farmer
Mother Teacher
Son Engineer
*/