package com.hashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class Ddemo3 {
public static void main(String[] args) {
	Set<Integer> data=new LinkedHashSet<>();
	data.add(23);
	data.add(34);
	data.add(12);
	System.out.println(data);
	LinkedHashSet <Integer> newdata=new LinkedHashSet<>();
	newdata.add(91);
	newdata.add(71);
	newdata.add(45);
	System.out.println(newdata);
	data.addAll(newdata);
	System.out.println(data);

}
}
/*
[23, 34, 12]
[91, 71, 45]
[23, 34, 12, 91, 71, 45]
*/