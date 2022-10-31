import java.io.*;
import java.util.Scanner;
class spalindrome
{
	public static void main (String[] args)
	{
		String pal="";
		Scanner myobj=new Scanner (System.in);
		System.out.println("enter string");
		String s=myobj.nextLine();
		for (int i=s.length()-1;i>=0;i--)
			pal=pal+s.charAt(i);
		int chk=pal.compareTo(s);
		String result=(chk==0)? "Palindrome":"Not palindrome";
		System.out.println(result);
	}
	
} 
