package com.hashset;

import java.util.*;
import java.util.Set;

public class Demo6 {
public static void main(String[] args) {
	Set<String> vowels = new HashSet<>();
	vowels.add("a");
	vowels.add("e");
	vowels.add("i");
	List<String> vowelsList = new ArrayList<>(vowels);
	System.out.println("vowels set = "+vowels);
	System.out.println("vowelsList = "+vowelsList);
	vowels.add("o");
	vowelsList.add("a");
	vowelsList.add("u");
	System.out.println("vowels set = "+vowels);
	System.out.println("vowelsList = "+vowelsList);
	vowels = new HashSet<>(vowelsList);
	System.out.println("vowels set = "+vowels);
}
}
