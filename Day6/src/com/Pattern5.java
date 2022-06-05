package com;
/*
 to print 
   *
  * *
 *   *
*     *
*/
public class Pattern5 {
public static void main(String[] args) {
	
	for(int i=1;i<=4;i++)
	{
		for(int j=3;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			if(i>=2 && k>1)
			{
				System.out.print(" ");
			}
			else
			{
				System.out.print("*");
			}
			
		}
        
		for(int m=2;m<=i;m++)
		{
			if(i>=2 && m<=i-1) {
				System.out.print(" ");
			}
			else
			{
				System.out.print("*");
			}
		}

	  
	
	
		
		System.out.println();
	}
}

}
