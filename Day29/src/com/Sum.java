package com;
import java.util.List;
import java.util.Arrays;

public class Sum {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(1,2,3,4,5,6);
	System.out.println(list.stream().map(i->i*2).reduce(0,(c,e)->(c+e)));
	System.out.println(list.stream().map(i->i*2).reduce(0,(c,e)->Integer.sum(c, e)));
	System.out.println(list.stream().map(i->i*2).reduce(0,Integer::sum));
}
}
