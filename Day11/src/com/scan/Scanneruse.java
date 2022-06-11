package com.scan;

import java.util.Scanner;

public class Scanneruse {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String Id=s.nextLine();
	String name=s.nextLine();
    int number=s.nextInt();
    double cash=s.nextDouble();
    boolean ulikecode=s.nextBoolean();
    System.out.println("name"+name+"\nnumber"+number+"\ncash"+cash+"\nulikecode"+ulikecode);
}
}
/*
name sanjay r
number 101
cash 5000.0
ulikecode true
*/