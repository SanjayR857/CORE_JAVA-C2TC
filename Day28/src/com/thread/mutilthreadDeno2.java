package com.thread;
class Eclipses implements Runnable{
	public void run() {
		System.out.println("Eclipse Id is"+Thread.currentThread().getId());
	}
	class PPTs implements Runnable{
		public void run() {
			System.out.println("PPTs id is "+Thread.currentThread().getId());
		}
	}
}
public class mutilthreadDeno2 {
   Eclipses obj1=new Eclipses();
   Thread t=new Thread(obj1);
   t.start();
   PPTs obj2=new PPTs();
   thread ta=new Thread(obj2);
   ta.start();
   
   
   
}
