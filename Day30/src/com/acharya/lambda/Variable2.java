package com.acharya.lambda;

interface Drawable1{
	 void draw(int width,int length);
}
public class Variable2 {
public static void main(String[] args) {
Drawable1 obj=(int width ,int length)->{
	System.out.println("draw cube with width and length: "+width+" "+length);
	};
obj.draw(10,20);

}
}
