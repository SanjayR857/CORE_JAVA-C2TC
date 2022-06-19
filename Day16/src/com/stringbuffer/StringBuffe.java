package com.stringbuffer;

public class StringBuffe {
public static void main(String[] args) {
	String str="study";
	str.concat("night");
	System.out.println(str);
   StringBuffer name=new StringBuffer("study");
	name.append("night");
	System.out.println(name);
}	
}
/*
output
study
studynight
*/