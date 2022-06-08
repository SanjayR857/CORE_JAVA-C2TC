package com.statments;

public class ContinueStatement {
public static void main(String[] args) {
	for(int i=0;i<=2;i++) {
		for(int j=0;j<=5;j++) {
			if(j==4) {
				continue;
			}
			System.out.print(j);
		}
		System.out.println();
	}
}
}
/* output
  01235
  01235
  01235
  */
