package com;
//for loop
public class Code17 {
public static void main(String[] args) {
	int number = 9;
	boolean isPrime = true;
	for(int i = 2; i < number/2; i++)
	{
		if(number % i == 0)
		{
			isPrime = false;
		}
	}
	if(isPrime == true)
	{
System.out.println("The number is a prime number");
	}
	else
	{
System.out.println("The number is not a prime number");
	}
	

}
}
//output
//The number is not a prime number

