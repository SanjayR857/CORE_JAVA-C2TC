package com;
//by method
public class emp {
     int id;
     String name;
     
	void insert(int i,String n) {
    	 id=i;
    	 name=n;
     }
     void display() {
    	 System.out.println(id+" "+name);
     }
     public static void main(String[] args) {
		emp e1=new emp();
		emp e2=new emp();
		e1.insert(111, "raju");
		e2.insert(123,"tom");
		e1.display();
		e2.display();
	}
}
