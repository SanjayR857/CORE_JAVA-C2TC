package com;
//to check
public class company {
	String name;
public static void main(String[] args) {
	company c1=new company();
	c1.name="c2tc";
	company c2=c1;
	c1=null;
	System.out.println(c2.name);
	new company();
	company c3;
	//c3.name="c2tc";
	//System.out.println(c3.name);
	//error
}
}
