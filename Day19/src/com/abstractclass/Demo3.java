package com.abstractclass;
abstract class Bank{
abstract int rateofInterest();
}
class Axis extends Bank{
	int rateofInterest() {
		return 7;
	}
}
class ICIC extends Bank{
	int rateofInterest() {
		return 9;
	}
}
public class Demo3 {
public static void main(String[] args) {
	Axis a=new Axis();
	ICIC i=new ICIC();
	System.out.println("Axis rate of interest "+a.rateofInterest());
	System.out.println("ICIC rate of interest "+i.rateofInterest());
}
}
