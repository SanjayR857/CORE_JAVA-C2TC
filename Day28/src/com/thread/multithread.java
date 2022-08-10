package com.thread;
//extend to class
class Eclipse extends Thread{
	public void run() {
		System.out.println("Eclipse ID is "+Thread.currentThread().getId());
	}
}
//extend to class
class PPT extends Thread{
	public void run() {
		System.out.println("PPT ID is "+Thread.currentThread().getId());
	}
}
public class multithread {
public static void main(String[] args) {
	Eclipse obj=new Eclipse();
	obj.start();
	PPT obj1=new PPT();
	obj1.start();
	
}
}
