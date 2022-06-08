package com_operator;

public class Unary {
public static void main(String[] args) {
	int x=5;
	int y=2;
	int z;
	int a;
	z=++y;
	a=x++;
	System.out.println("x= "+x+" y= "+y+" z= "+z+" a= "+a);
}
}
/* output
x= 6 y= 3 z= 3 a= 5
*/