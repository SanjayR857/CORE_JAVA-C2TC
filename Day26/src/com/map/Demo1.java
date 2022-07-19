package com.map;
import java.util.*;
public class Demo1 {
public static void main(String[] args) {
	Map<Integer,String> s=new HashMap<>();
	s.put(100,"java");
	s.put(50, "we");
	s.put(234, "Welcome");
	System.out.println(s);
}
}
//{50=we, 100=java, 234=Welcome}