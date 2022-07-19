package com.hashset;

import java.util.*;

public class Demo8 {
public static void main(String[] args) {
	TreeSet<String> sites = new TreeSet<>();
	sites.add("Technical");
	sites.add("Technology");
	sites.add("quiz");
	sites.add("code");
	System.out.println("Sorted Set: " + sites);
	System.out.println("First: " + sites.first());
	System.out.println("Last: " + sites.last());
}
}
/*
Sorted Set: [Technical, Technology, code, quiz]
First: Technical
Last: quiz
*/