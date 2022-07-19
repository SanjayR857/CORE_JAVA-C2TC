package com.map;
import java.util.*;
public class Demo2 {
public static void main(String[] args) {
	Map ob=new HashMap();
	System.out.println(ob);
	ob.put(15, "Welcome");
	ob.put("daa", "welcome");
	ob.put(10.90, "we");
	ob.put(12, "san");
	System.out.println(ob);
}
}
/*
{}
{daa=welcome, 10.9=we, 12=san, 15=Welcome}
*/