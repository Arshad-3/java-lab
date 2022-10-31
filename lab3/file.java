import java.io.*;
import java.util.Scanner;
class file
{
	public static void main(String[] args)
	{
		try
		{
			File f=new File("file.txt");
			f.createNewFile();
			Writer w=new FileWriter(f.getName());
			Scanner obj=new Scanner(System.in);
			System.out.println("enter string ");
			String s=obj.nextLine();
			w.write(s);
			w.close();
			Reader r=new FileReader (f.getName());
			int ch=r.read();
			System.out.println("the contents of file are ");
			while(ch !=-1)
			{
				System.out.print((char)ch);
				ch=r.read();
			}
			r.close();
		}
		catch (IOException e)
		{
			System.out.print(e);
		}
	}
}
