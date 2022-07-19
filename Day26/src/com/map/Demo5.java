package com.map;
import java.util.*;
public class Demo5 {
public static void main(String[] args) {
	
	HashMap<String, Double> bike = new HashMap<String, Double>();
	bike.put("Gixxer", 155.5);
	bike.put("Royal Enfield", 350.00);
	bike.put("KTM RC 390", 373.5);
	bike.put("RE Himalayan", 410.00);
	System.out.println(bike.keySet());
	System.out.println(bike.entrySet());
}
}
/*
[KTM RC 390, Gixxer, Royal Enfield, RE Himalayan]
[KTM RC 390=373.5, Gixxer=155.5, Royal Enfield=350.0, RE Himalayan=410.0]
*/