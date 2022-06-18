package com.Predicttheoutput;

public class Code4 {
public static void main(String[] args) {
	String s="tom"; String t="cherry";
	String u=s.concat(t);

	if(u==s) {
		System.out.println("same");
	}
	else {
		System.out.println("not same");
	}
	String e=s+t;

	if(e==s) {
		System.out.println("same");
	}
	else {
		System.out.println("not same");
	}
	
}
}
//not same
//not same