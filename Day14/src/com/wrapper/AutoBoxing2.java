package com.wrapper;

public class AutoBoxing2 {
public static void main(String[] args) {
	int i=5;
	float f=5.5f;
	boolean b=true;
	long l=45L;
	char ch='a';
	short sh=45;
	byte by=34;
	double dou=567.65;
	//autoboxing
	Integer in=i;
	Float fl=f;
	Boolean Bo=b;
	Long lo=l;
	Character chr=ch;
	Short sho=sh;
	Byte By=by;
	Double D=dou;
	System.out.println("object value");
	System.out.println("Integer:"+in);
	System.out.println("Float:"+fl);
	System.out.println("Boolean:"+Bo);
	System.out.println("Long:"+l);
	System.out.println("Character:"+ch);
	System.out.println("Short:"+sho);
	System.out.println("Byte:"+ By);
	System.out.println("Double:"+D);
	
}
}
/*
 output
object value
Integer:5
Float:5.5
Boolean:true
Long:45
Character:a
Short:45
Byte:34
Double:567.65
*/
