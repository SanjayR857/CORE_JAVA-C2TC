package com.constructor;

public class student {
	//instance variables
	int id;
	String name;
	String col;
	//constructor
  student(int i,String n,String s){
	  id=i;
	  name=n;
	  col=s;
	  
	  
  }
  //method
  void display() {
	  System.out.println("student Id:"+id+"\nstudent name:"+name+"\ncollege name:"+col);
  }
  public static void main(String[] args) {
	  //object creating
	student s1=new student(123,"sanjay","AIT");
	//calling method
		s1.display();
}
}
/*
 student Id:123
student name:sanjay
college name:AIT
*/
