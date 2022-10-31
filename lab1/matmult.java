import java.io.*;
import java.util.Scanner;
class matmult
{
	public static void main (String[] args)
	{
		int m,n,p,q,i,j,k;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter order of matrix 1");
		m=obj.nextInt();
		n=obj.nextInt();
		System.out.println("enter order of matrix 2");
		p=obj.nextInt();
		q=obj.nextInt();
		if (n!=p)
		{	System.out.println("cannot multiply");
			System.exit(0);
		}
		int a[][]=new int[m][n];
		int b[][]=new int[p][q];
		int c[][]=new int[m][q];
		System.out.println("enter elements of 1");
		for (i=0;i<m;i++)
		{
			for (j=0;j<n;j++)
				{a[i][j]=obj.nextInt();}
		}
		System.out.println("enter elements of 2");
		for (i=0;i<p;i++)
		{
			for (j=0;j<q;j++)
				{b[i][j]=obj.nextInt();}
		}
		
		for (i=0;i<m;i++)
		{
			for (j=0;j<q;j++)
			{
				c[i][j]=0;
				for(k=0;k<n;k++)
				{
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		
		System.out.println("product is");
		for (i=0;i<m;i++)
		{
			for (j=0;j<q;j++)
				System.out.print(c[i][j]+" ");
			System.out.println("");
		}
		
	}
}
