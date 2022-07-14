package com.interfacedemo2;



public class Son implements Father,Mother {
public void myMethod(){
	System.out.println("father good to coding");
}
public void myothermethod() {
	System.out.println("mother good to cooking");
}
public static void main(String[] args) {
	Son s=new Son();
	s.myMethod();
	s.myothermethod();
}
}
