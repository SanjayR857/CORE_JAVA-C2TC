package com.acharya.lambda;
interface Addition{
	public int  add(int a,int b);
}

public class Variable3 {
public static void main(String[] args) {
	Addition obj=(int a,int b)-> (a+b);{
		System.out.println(obj.add(10, 20));
	};
}
}
