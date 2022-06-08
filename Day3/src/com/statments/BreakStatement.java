package com.statments;

public class BreakStatement {
public static void main(String[] args) {
	for(int i=0;i<5;i++) {
		System.out.println(i);
		if(i==3) {
			break;
		}
	}
}
}
/* output
0
1
2
3
*/