interface Student
{
	public int m1=98,m2=90,m3=95;
	public String name="Anu";
	public int cls=10;
	void disp();
}
interface Sports
{
	public int s1=88,s2=50;
	void disp();
}
class Result implements Student,Sports
{
	public void disp()
	{
		System.out.println("\nSTUDENT DETAILS");
		System.out.println("\n---------------\n");
		System.out.println("NAME OF STUDENT="+name);
		System.out.println("CLASS  	   ="+cls);
		System.out.println("\nMARK  1	   ="+m1);
                System.out.println("MARK  2	   ="+m2);
                System.out.println("MARK  3	   ="+m3);
                System.out.println("\nTOTAL ACADEMIC MARK="+(m1+m2+m3));
                System.out.println("\nSCORE  1    ="+s1);
		System.out.println("SCORE  2    ="+s2);
		System.out.println("\nTOTAL SPORTS SCORE="+(s1+s2));
	}
}
class Program_11
{
	public static void main(String args[])
	{
		Result r=new Result();
		r.disp();
	}
}