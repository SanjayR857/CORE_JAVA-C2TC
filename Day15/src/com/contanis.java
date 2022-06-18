package com;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class contanis {
public static void main(String[] args) {
	//exp 1
	String name="student";
	System.out.println(name.contains("t"));//true
	System.out.println(name.contains("h"));//FALSE
	//exp 2
	String str = "Hello T#E#C#H#N#O#S#E#R#V#E@2.0 readers";
	boolean isContains = str.contains("T#E#C#H#N#O#S#E#R#V#E");//true
	System.out.println(isContains);
	System.out.println(str.contains("TECHNOSERVE"));//false
	//exp 3
	String stra = "To learn Java visit abc.in";

	if(stra.contains("abc.in.com"))

	{

	System.out.println("This string contains abc.in");

	}

	else

	System.out.println("Result not found");//this is exu

	}
}

