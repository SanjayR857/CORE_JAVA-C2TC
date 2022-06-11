package com.scan;

import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int sum=0,count=0;
	//loop
	while(count<=2) {
		int num=s.nextInt();
		sum+=num;
		count++;
		
	}
	int mean=sum/count;
	System.out.println("mean: "+mean);
	}
}

