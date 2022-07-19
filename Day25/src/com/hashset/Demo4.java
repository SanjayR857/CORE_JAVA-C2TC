package com.hashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demo4 {
public static void main(String[] args) {
	Set<Integer> data=new LinkedHashSet<>();
	data.add(1);
	data.add(2);
	data.add(3);
	data.add(4);
	data.add(5);
	System.out.println(data);
	LinkedHashSet newdata=new LinkedHashSet<>();
	newdata.add(1);
	newdata.add(2);
	newdata.add(3);
	System.out.println(newdata);
	data.retainAll(newdata);
	System.out.println(data);
	data.removeAll(newdata);
	System.out.println(data);
}
}
/*[1, 2, 3, 4, 5]
  [1, 2, 3]
  [1, 2, 3]
  []
*/
