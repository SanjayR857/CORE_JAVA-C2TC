package com.thread;

class Apps extends Thread{
	public void run() {
	System.out.println("Apps Id is "+Thread.currentThread().getId());
	System.out.println("Apps priority is "+Thread.currentThread().getPriority());
	}
}
class Android extends Thread{
	public void run() {
		System.out.println("Android Id is "+Thread.currentThread().getId());
		System.out.println("Android priority is "+Thread.currentThread().getPriority());
		}
	}

public class multithreadDemo3 {
public static void main(String[] args) {
	Apps obj1=new Apps();
	obj1.start();
	obj1.setPriority(5);
	Android obj2=new Android();
	obj2.start();
	obj2.setPriority(Thread.MIN_PRIORITY);
	Apps obj3=new Apps();
	obj3.start();
	obj3.setPriority(Thread.MAX_PRIORITY);
}
}
