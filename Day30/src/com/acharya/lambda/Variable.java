package com.acharya.lambda;
interface Drawable{
	 void draw(int radius);
}
public class Variable {
public static void main(String[] args) {
Drawable obj=(int radius)->{
	System.out.println("draw circle of radius: "+radius);
	};
obj.draw(10);

}
}
