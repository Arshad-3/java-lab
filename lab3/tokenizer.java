import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;
class tokenizer
{
	public static void main(String[] args)
	{
		int sum=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter nos. ");
		String s=obj.nextLine();
		StringTokenizer st=new StringTokenizer(s," ");
		StringTokenizer st1=new StringTokenizer(s," ");
		System.out.println("the nos are");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		while(st1.hasMoreTokens())
		{
			sum+=Integer.parseInt(st1.nextToken());
		}
		System.out.println("The sum is "+sum);
	}	
}
