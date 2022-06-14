package com.wrapper;

public class UnBoxing2 {
public static void main(String[] args) {
	Integer in=34;
	Float fl=5.6f;
	Boolean Bo=false;
	Long lo=45L;
	Character chr='y';
	Short sho=34;
	Byte By=2;
	Double D=45.657;
	//unboxing
	int inttype=in;
	float floattype=fl;
	boolean booltype=Bo;
	long longtype=lo;
	char chartype=chr;
	short shorttype=sho;
	byte bytetype=By;
	double doubletype=D;
	System.out.println("==========");
	System.out.println("int:"+inttype);
	System.out.println("floalt:"+floattype);
	System.out.println("boolean:"+bytetype);
	System.out.println("long:"+longtype);
	System.out.println("char"+chartype);
	System.out.println("short"+shorttype);
	System.out.println("byte"+bytetype);
	System.out.println("double"+doubletype);
	
}
}
/*
 ==========
int:34
floalt:5.6
boolean:2
long:45
chary
short34
byte2
double45.657
*/
