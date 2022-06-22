package com.abstractclass1;
abstract class Movie{
	String Titel;
	abstract void setTitel(String name);
	
}
class Mymovie extends Movie{
	void setTitel(String name) {
		Titel=name;
	}
	String getTitel() {
		return Titel;
	}
}
public class MyBook {
public static void main(String[] args) {
	Mymovie m=new Mymovie();
	m.setTitel("SuperMan");
	System.out.println("the Movie Titel is "+m.getTitel());
}
}
