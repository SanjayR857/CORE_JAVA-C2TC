package com.abstractclass1;
abstract class Animal{
	abstract void eat();
}
class Herbivores extends Animal{
	void eat() {
		System.out.println(" i am vegetarian");
	}
}
class carnivores extends Animal{
	void eat() {
		System.out.println(" i am non vegetarian");
	}
}
class ominvores extends Animal{
	void eat() {
		System.out.println(" i am vegetarian and non vegetarian");
	}
}
public class Demo5 {
public static void main(String[] args) {
	Herbivores goat=new Herbivores();
	carnivores tiger=new carnivores();
	ominvores bear=new ominvores();
	goat.eat();
	tiger.eat();
	bear.eat();
}
}
/*
i am vegetarian
i am non vegetarian
i am vegetarian and non vegetarian
*/