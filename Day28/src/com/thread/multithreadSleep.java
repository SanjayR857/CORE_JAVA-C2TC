package com.thread;



class machine extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("machine Id is "+Thread.currentThread().getId());
			try {
				sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
public class multithreadSleep {
public static void main(String[] args) {
	machine obj1=new machine();
	obj1.start();
}
}
