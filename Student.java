import java.util.*;
class Student
{
	String name;
	int rollno,total;
	int mark1,mark2,mark3;
	void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter Student Name:");
		name=sc.nextLine();
		System.out.print("Enter Roll Number:");
		rollno=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Mark 1 :");
		mark1=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Mark 2 :");
                mark2=Integer.parseInt(sc.nextLine());
                System.out.print("Enter Mark 3 :");
                mark3=Integer.parseInt(sc.nextLine());
		total=mark1+mark2+mark3;
	}
	void disp()
	{
		System.out.println("NAME    = "+name);
		System.out.println("ROLL NO = "+rollno);
		System.out.println("MARK 1  = "+mark1);
		System.out.println("MARK 2  = "+mark2);
		System.out.println("MARK 3  = "+mark3);
		System.out.println("TOTAL   = "+total);
	}
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.read();
		System.out.println("\n--STUDENT 1--\n");
		s1.disp();
                Student s2=new Student();
                s2.read();
		System.out.println("\n--STUDENT 2--\n");
		s2.disp();
                Student s3=new Student();
                s3.read();
		System.out.println("\n--STUDENT 3--\n");
		s3.disp();
		if(s1.total>s2.total && s1.total>s3.total)
			System.out.println(s1.name+" have highest score with "+s1.rollno+" mark");
		else if(s2.total>s1.total && s2.total>s3.total)
                        System.out.println(s2.name+" have highest score with "+s2.rollno+" mark");
		else
			System.out.println(s3.name+" have highest score with "+s3.rollno+" mark");
	}
}