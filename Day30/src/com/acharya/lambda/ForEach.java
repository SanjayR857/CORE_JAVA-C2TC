package com.acharya.lambda;
import java.util.List;
import java.util.ArrayList;

public class ForEach {
public static void main(String[] args) {
	List<String> obj=new ArrayList<>();
	obj.add("sanjay");
	obj.add("Dina");
	obj.add("tom");
	obj.forEach(temp-> System.out.println(temp));
}
}
