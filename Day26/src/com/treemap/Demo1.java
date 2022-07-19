package com.treemap;
import java.util.*;
public class Demo1 {
public static void main(String[] args) {
	SortedMap<Integer,String> st=new TreeMap<Integer,String>();
	st.put(3,"three");
	st.put(2,null);
	st.put(1,"one");
	st.put(4,"four");
	st.put(6,"null");
	st.put(5,"five");
	st.put(7,null);
	System.out.println(st);
}
}
/*
{1=one, 2=null, 3=three, 4=four, 5=five, 6=null, 7=null}
*/