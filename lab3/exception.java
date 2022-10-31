import java.io.*;
import java.util.Scanner;
class exception
{
	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		try{
			File f=new File ("file6.txt");
			FileOutputStream fout=new FileOutputStream(f);
			Scanner obj=new Scanner(System.in);
			System.out.println("enter string ");
			String s=obj.nextLine();
			byte b[]=s.getBytes();
			fout.write(b);
			fout.close();
			FileInputStream fin=new FileInputStream(f);
			int ch=fin.read();
			System.out.println("the contents of file are ");
			while(ch !=-1)
			{
				System.out.print((char)ch);
				ch=fin.read();
			}
			fin.close();
			
		}
		catch(FileNotFoundException e)
		{
			//throw new FileNotFoundException("File is not found in folder");
				System.out.print(e);
		}
		finally
		{
			System.out.println("\nprogram over");
		}
		
	}
}
