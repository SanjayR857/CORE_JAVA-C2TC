package com;
import java.util.Arrays;
import java.util.List;
public class Lazymethod {
	public static boolean isDivision(int i) {
		System.out.println("in is division "+i);
		return i%5==0;
	}
	public static int mapDouble(int i) {
		System.out.println("in mapDouble "+i);
		return i*2;
	}
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(12,20,23,30,45,50,70,75);
	System.out.println(list.stream().filter(Lazymethod::isDivision).map(Lazymethod::mapDouble).findFirst().orElse(0));
	
}
}
