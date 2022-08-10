package com;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForEach {
public static void main(String[] args) {
	List <Integer> list=Arrays.asList(1,2,3,4,5,6);
	//External Iterator
	//for loop
	for(int i=0;i<6;i++) {
		System.out.println(list.get(i));
	}
	//Iterator
	Iterator arr=list.iterator();
	while(arr.hasNext()) {
		System.out.println(arr.next());
	}
	//advan fir loop
	for(Integer i: list) {
		System.out.println(i);
	}
	//internal for loop
	list.forEach(Value-> System.out.println(Value));
}
}
