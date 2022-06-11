package com.thiskey;

public class S2 {
	//method
void m() {
	System.out.println("method is invokes");
}
//method
void p() {
	//calling method
	m(this);
}
}
class Main{
	public static void main(String[] args) {
		S2 s1=new S2();
		s1.p();
	}
}