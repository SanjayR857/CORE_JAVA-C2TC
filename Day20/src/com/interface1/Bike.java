package com.interface1;

public interface Bike {
void getMileage();
void getEngine_CC();
}
class R15 implements Bike{
	
	public void getMileage(){
		
		System.out.println("50 mile per hour");
	}
	public void getEngine_CC() {
		
		System.out.println("120 cc engine");
	}
	public static void main(String[] args) {
		R15 obj=new R15();
		obj.getMileage();
		obj.getEngine_CC();
	}
}
