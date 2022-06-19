package com;

import java.util.Scanner;

// 1 2 5 6 9 10......
public class pattern2 {
public static void main(String[] args) {
	Scanner str=new Scanner(System.in);
	 //enter the number of loop
	 int n=str.nextInt();
	 int a=1;
	 System.out.print(a+" ");
	 int b=2;
	 System.out.print(b+" ");
	 for(int i=3;i<=n;i++) {
		 if(i%2==1) {
			 a=a+4;
			 System.out.print(a+" ");
		 }
		 else {
			 b=b+4;
			 System.out.print(b+" ");
		 }
}
}
}
/*
output
1 2 5 6 9 10
*/