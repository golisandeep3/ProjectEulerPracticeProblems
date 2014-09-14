/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n1=1;
		int n2=2,sum=n2;
		while(true)
		{
			int n3=n1+n2;
			if(n3>4000000)
			break;
			if(n3%2==0)
			sum+=n3;
			
			n1=n2;
			n2=n3;
		}
		System.out.println(sum);
	}
}
