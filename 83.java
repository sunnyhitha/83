/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		char c=sc.next().charAt(0);
		b=sc.nextInt();
		if(a>=b)
		{
			switch(c)
			{
				case '/':
					   int d=a/b;
					   System.out.print(d);
					   break;
				case '%':
					   d=a%b;
					   System.out.print(d);
					   break;
			}
		}
		else
		{
			System.out.print(a);
		}// your code goes here
	}
}
