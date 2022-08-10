package com;
import java.util.Arrays;
import java.util.List;
public class Method_Fist {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(3,40,6,80,9);
  System.out.println(list.stream().filter(i->i%5==0).map(i->i*2).findFirst().orElse(0));
}
}
