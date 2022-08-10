package com.thread;

class Counter {
	int count;
	public synchronized void increments() {
		count++;
	}
}
public class mutilthreadSyno {
public static void main(String[] args) throws Exception{
	Counter c=new Counter();
	Thread t1=new Thread(new Runnable() {
		public void run() {
			c.increments();
		}
	});
	t1.start();
	t1.join();
	Thread t2=new Thread(new Runnable() {
		public void run() {
			c.increments();
		}
	});
	t2.start();
	t2.join();
	System.out.println(c.count);
}
}
