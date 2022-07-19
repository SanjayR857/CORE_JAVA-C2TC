package com.list;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class Demo2 {
public static void main(String[] args) {
	List<Integer> num=new ArrayList<>();
	num.add(5);
	num.add(20);
	num.add(10);
	num.add(15);
	System.out.println(num);
	Collections.rotate(num, 2);
	System.err.println("rotate "+num);
	Collections.shuffle(num);
	System.out.println("shiffle "+num);
	Collections.sort(num);
	System.out.println("sort "+num);
	Collections.sort(num,Collections.reverseOrder());
	System.out.println("reverse order "+num);

}
}
/*
[5, 20, 10, 15]
rotate [10, 15, 5, 20]
shiffle [15, 20, 10, 5]
sort [5, 10, 15, 20]
reverse order [20, 15, 10, 5]
*/