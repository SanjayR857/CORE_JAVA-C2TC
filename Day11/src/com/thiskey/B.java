package com.thiskey;

public class B {
A4 obj;
B(A4 obj){
	this.obj=obj;
}
void display() {
	System.out.println(obj.data);
}
}
class A4{
	int data=10;
	A4(){
		B b=new B(this);
		b.display();
	}
}
public class m{
	public static void main(String[] args) {
		A4 a=new A4();
	}
}
