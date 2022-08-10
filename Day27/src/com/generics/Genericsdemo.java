package com.generics;
class Data<T>{
	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	public void show() {
		System.out.println(value.getClass().getName());
	}
}
public class Genericsdemo {
Data<Integer> obj=new Data<>();

   
}
