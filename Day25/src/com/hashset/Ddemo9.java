package com.hashset;
import java.util.*;
public class Ddemo9 {
public static void main(String[] args) {
	TreeSet<String> set=new TreeSet<String>();
	
	set.add("Tokiyo");
	set.add("Nairobi");
	set.add("rio");
	set.add("Berlin");
	set.add("denver");

	System.out.println("Sorted Set: "+set);
}
}
//Sorted Set: [Berlin, Nairobi, Tokiyo, denver, rio]