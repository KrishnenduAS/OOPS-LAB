import java.util.*;
class employee
{
    int empid,sal;
    String name,add;
    employee(int e,String n,int s,String a)
    {
        empid=e;
        name=n;
        sal=s;
        add=a;
    }
    void disp()
    {
        System.out.println("Emp  id :"+empid);
        System.out.println("Name  :"+name);
        System.out.println("Salary :"+name);
        System.out.println("Address :"+name);
    }
}
class teacher extends employee
{
    String dept;
    String sub;
    teacher(int e,String n,int s,String a,String d,String su)
    {
        super(e,n,s,a);
        dept=d;
        sub=su;
    }
    void disp()
    {
        super.disp();
         System.out.println("Department  :"+dept);
         System.out.println("Subject :"+sub);
    }
}
class Program_10
{
public static void main (String[] args) {
    int n,empid,sal;
    String name,add,dept,sub;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of teacher:" );
    n=Integer.parseInt(sc.nextLine());
    teacher[] t=new teacher[n];
    for(int i=0;i<n;i++)
    {
        System.out.println("Enter Details of "+(i+1)+ "Employee");
        System.out.print(" Enter  Name  :");
        name=sc.nextLine();
        System.out.print("Enter id      :");
        empid=Integer.parseInt(sc.nextLine());
        System.out.print("Enter salary  :");
        sal=Integer.parseInt(sc.nextLine());
        System.out.print(" Enter Address:");
        add=sc.nextLine();
        System.out.print("Enter Department:");
        dept=sc.nextLine();
        System.out.print("Enter Subject:");
        sub=sc.nextLine();
        t[i]=new teacher(empid,name,sal,add,dept,sub);
        
         
         
    }
    for(teacher i:t)
    {
        
        i.disp();
        System.out.println("Details");
    }    
}
}
