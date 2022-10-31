import java.io.*;
import java.util.Scanner;
abstract class shapes
{
	abstract void no_of_side();
}

class rectangle extends shapes
{
	void no_of_side()
	{
		System.out.print("4 sides");
	}
}
class triangle extends shapes
{
	void no_of_side()
	{
		System.out.print("3 sides");
	}
}
class hexagon extends shapes
{
	void no_of_side()
	{
		System.out.print("6 sides");
	}
} 
class shape
{
	public static void main(String[] args)
	{
		rectangle r=new rectangle();
		triangle t=new triangle();
		hexagon h=new hexagon();
	}
}
