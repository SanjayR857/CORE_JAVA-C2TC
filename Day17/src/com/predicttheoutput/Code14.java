package com.predicttheoutput;
/*Write a program to find out total marks obtained by a student if the
student gets 3 marks for the correct answer and -1 for the wrong
answer*/
public class Code14 {
public static void main(String[] args) {
	int a[]= {1,0,1,1,0,0,1,1};
	int sum=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]==1)
			sum=sum+3;
		else
			sum=sum-1;
	}
	System.out.println("sum: "+sum);
}
}
//sum: 12