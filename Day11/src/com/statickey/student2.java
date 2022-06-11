package com.statickey;
//using static block
public class student2 {
	//instance variables
int id;
String name;
//static 
static String college;
//constructor
student2(int id,String name){
	this.id=id;
	this.name=name;
}
//static block
static{
	college="AIT";
}
//method void type
void display() {
	System.out.println(id+" "+name+" "+college);
}
public static void main(String[] args) {
	
	//object creating 
	student2 s=new student2(123,"Iron");
	//method call
	s.display();
}
}
