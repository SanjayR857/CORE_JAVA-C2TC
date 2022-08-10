package com.thread;
//extend to class
class EclipseDemo extends Thread{
	public void run() {
		for(int i=0;i<3;i++) {
		System.out.println("Eclipse ID is "+Thread.currentThread().getId());
		}
	}
}
//extend to class
class PPTDemo extends Thread{
	public void run() {
		for(int i=0;i<3;i++) {
		System.out.println("PPT ID is "+Thread.currentThread().getId());
		}
	}
}
public class multithreadDemo1 {
public static void main(String[] args) {
	EclipseDemo obj=new EclipseDemo();
	obj.start();
	PPTDemo obj1=new PPTDemo();
	obj1.start();
	
}
}

