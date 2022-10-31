import java.io.*;
class garbage
{
	public static void main(String[] args)
	{
		long m1,m2;
		System.out.println("Total memory is "+Runtime.getRuntime().totalMemory());
		m1=Runtime.getRuntime().freeMemory();
		System.out.println("initial free memory is "+m1);
		System.gc();
		m2=Runtime.getRuntime().freeMemory();
		System.out.println("free memory after gc is "+m2);
		System.out.println("garbage collected is "+(m2-m1));
	}
}
