package com.predicttheoutput;

public class Code2 {
public static void main(String[] args) {
	int arr[]= {10,20,30,40,50};
	int a=50;
	call(a,arr);
	System.out.println(a);
	System.out.println(arr[0]);
	System.out.println(arr[1]);
}

private static void call(int a, int[] arr) {
	// TODO Auto-generated method stub
	a=a+2;
	arr[0]=100;
	arr[1]=200;

}
}
/*
output
50
100
200
*/