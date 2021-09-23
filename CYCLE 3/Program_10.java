import java.util.*;
class Employee
{
	int empid,salary;
	String name,address;
	Scanner sc=new Scanner(System.in);
	Employee(int id,String n,int sal,String ad)
	{
		empid=id;
		name=n;
		salary=sal;
		address=ad;
	}
	void disp()
	{
		System.out.println("EMPLOYEE  ID  ="+empid);
		System.out.println("EMPLOYEE NAME ="+name);
		System.out.println("SALARY        ="+salary);
		System.out.println("ADDRESS       ="+address);
	}
}
class Teacher extends Employee
{
	String dpmt,sub;
	Teacher(int id,String n,int sal,String ad,String d,String s)
	{
		super(id,n,sal,ad);
		dpmt=d;
		sub=s;
	}
	void disp()
	{
		super.disp();
		System.out.println("DEPARTMENT    ="+dpmt);
		System.out.println("SUBJECT       ="+sub);
	}
}
class Program_10
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Teachers:");
	    int n=sc.nextInt();
		Teacher t[]=new Teacher[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("\n--Enter details of Teacher "+(i+1)+"--\n");
			System.out.print("Enter Employee ID:");
			int empid=sc.nextInt();
			System.out.print("Enter Employee Name:");
			String name=sc.nextLine();
			System.out.print("Enter Salary:");
			int salary=sc.nextInt();
			System.out.print("Enter Address:");
			String address=sc.nextLine();
			System.out.print("Enter Department:");
			String dpmt=sc.nextLine();
			System.out.print("Enter Subject:");
			String sub=sc.nextLine();
			t[i]=new Teacher(empid,name,salary,address,dpmt,sub);
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("\n----------\nEMPLOYEE "+(i+1)+"\n---------- ");
			t[i].disp();
		}
	}
}
