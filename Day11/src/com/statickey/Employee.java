package com.statickey;
//using static keyword to change the static variable
public class Employee {
	//instance variables
 int id;
 String name;
//static variable
static  String company="C2TC";
 //constructor
 Employee(int id,String name){
	 this.id=id;
	 this.name=name;
 }
 //static 
 static void change() {
	 company="techo";
 }
 //method
 void display() {
	 System.out.println(id+" "+name+" "+company);
 }
 public static void main(String[] args) {
	//object creating
	 Employee e1=new Employee(101,"jerry");
	 Employee e2=new Employee(202, "Tom");
	 //calling display method
	 e1.display();
	 //changing static company name
	 e2.change();
	 //calling display method
	 e2.display();
	 
	 
}
}
/*
101 jerry C2TC
202 Tom techo
*/