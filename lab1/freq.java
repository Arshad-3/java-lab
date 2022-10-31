import java.io.*;
import java.util.Scanner;
class freq
{
	public static void main (String[] args)
	{
		int count=0;
		Scanner myobj=new Scanner (System.in);
		System.out.println("enter string");
		String s=myobj.nextLine();
		System.out.println("enter char");
		char c=myobj.next().charAt(0);
		for(int i=0;i<s.length();i++)
		{
			if (c==s.charAt(i))
				count++;
		}
		System.out.print("count of "+c+" is ");
		System.out.println(count);
	}                                
}
