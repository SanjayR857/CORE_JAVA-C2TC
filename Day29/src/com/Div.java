package com;
import java.util.Arrays;
import java.util.List;

public class Div {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(12,30,15,76,80);
	System.out.println(list.stream().filter(i->i%5==0).reduce(0,(c,e)->(c+e)));
	System.out.println(list.stream().filter(i->i%5==0).reduce(0,(c,e)->Integer.sum(c, e)));
	System.out.println(list.stream().filter(i->i%5==0).reduce(0,Integer::sum));
}
}
