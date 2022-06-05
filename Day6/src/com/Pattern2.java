package com;
/*
 * to print
 *    8
 *   88
 *  888
 * 8888
 *  888
 *   88
 *    8   
 */
public class Pattern2 {

	
	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("8");
			}
			System.out.println();
		}
        for(int i=1;i<=4;i++)
        {
        	for(int j=0;j<=i;j++)
        	{
        		System.out.print(" ");
        	}
        	for(int k=3;k>=i;k--) {
        		System.out.print("8");
        	}
        	System.out.println();
        }
	}
}
