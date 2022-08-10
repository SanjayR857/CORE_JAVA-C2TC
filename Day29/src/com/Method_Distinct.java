package com;
import java.util.Arrays;
import java.util.List;

public class Method_Distinct {
public static void main(String[] args) {
	List <Integer>list=Arrays.asList(2,3,5,4,7);
	list.stream().distinct().forEach(System.out::println);
}
}
