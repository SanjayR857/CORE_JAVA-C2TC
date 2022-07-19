package com.map;
import java.util.*;
public class Demo6 {
public static void main(String[] args) {
	Map<Character,String> ob=new HashMap();
	ob.put('a', "Anil");
	ob.put('b', "bubu");
	ob.put('c', "chandan");
	ob.put('c',"chrani");
	ob.remove("bubu");
	System.out.println(ob);
}
}
/*
{a=Anil, b=bubu, c=chandan}
*/