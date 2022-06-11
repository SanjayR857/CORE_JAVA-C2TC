package com.constructor;

public class ConstructorOverloading {
 ConstructorOverloading(){
	 System.out.println("this is zero arg constructor");
 }
 ConstructorOverloading(int a){
	 System.out.println("this is a int constructor");
 }
 ConstructorOverloading(double b){
	 System.out.println("this is b double constructor");
 }
 ConstructorOverloading(int a,double b){
	 System.out.println("this is int  a ,double b");
 }
 ConstructorOverloading(double a,int b){
	 System.out.println("this is double a,int b");
 }
 public static void main(String[] args) {
	ConstructorOverloading c= new ConstructorOverloading();
	c=new ConstructorOverloading(101);
	c=new ConstructorOverloading(24.5);
	c=new ConstructorOverloading(234,235.6);
	c=new ConstructorOverloading(234.56,345);
}
}
/*
this is zero arg constructor
this is a int constructor
this is b double constructor
this is int  a ,double b
this is double a,int b
*/