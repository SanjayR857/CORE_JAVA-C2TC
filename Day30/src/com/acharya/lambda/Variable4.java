package com.acharya.lambda;
interface Addition1{
	public int add();
}
public class Variable4 {
public static void main(String[] args) {
	Addition1 ob=()->(10+30);{
		System.out.println(ob.add());
	};
}
}
