/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int num=1000,sum=0;
		for(int i=1;i<num;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum+=i;
			}
			
		}
		System.out.println(sum);
	}
}
