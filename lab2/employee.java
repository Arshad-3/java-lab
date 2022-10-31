import java.io.*;
import java.util.Scanner;
class employee
{
	int salary,age;
	long phone;
	String name,address;
	Scanner obj=new Scanner(System.in);
	void get_details()
	{
		System.out.print("enter name:");
		name=obj.nextLine();
		System.out.print("enter age ");
		age=obj.nextInt();
		System.out.print("enter phone no. ");
		phone=obj.nextLong();
		System.out.print("enter address ");
		address=obj.nextLine();
		obj.nextLine();
		System.out.print("enter salary ");
		salary=obj.nextInt();
	}
	void print_details()
	{
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("phone no.: "+phone);
		System.out.println("address: "+address);
		System.out.println("salary: "+salary);
	}
	void print_salary()
	{
		System.out.println(salary);
		
	}
	
	public static void main(String[] arg)
	{
		Scanner obj=new Scanner(System.in);
		officer o=new officer();
		manager m=new manager();
		System.out.print("enter details of officer \n");
		o.get_details();
		System.out.print("enter specialization: ");
		o.specn=obj.nextLine();
		System.out.print("enter details of manager \n");
		m.get_details();
		m.dept=obj.nextLine();
		System.out.print("details of officer \n");
		o.print_details();
		System.out.print("details of manager \n");
		m.print_details();
	}
}

class officer extends employee
{
	String specn;
	
}

class manager extends employee
{  
	String dept;
}
