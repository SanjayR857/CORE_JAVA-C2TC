package com;

public class Operater {
public static void main(String[] args) {
	String s = "Are", t = "you", u = "ready";

	System.out.println(s + t + u);

	System.out.println(s.concat(t));
//	System.out.println(s.concat(t,u));//error
}
}
/*
Areyouready
Areyou*/