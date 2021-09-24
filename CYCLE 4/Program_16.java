import java.util.*;
class thread1 extends Thread
{
    public void run()
    {
        System.out.print("Multiplication table of 5 :");
        for(int i=1;i<=10;i++)
        {
        System.out.println(+i+" "+ "* 5 ="+(i*5));
        }
    }
}
class thread2 extends Thread
{
    public void run()
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n :");
    int n=Integer.parseInt(sc.nextLine());
    System.out.print("Prime numbers :");
    for (int i = 2; i<= n; i++)
    {
        int count = 0;
        for (int j = 2; j<= i / 2; j++)
        {
            if (i % j == 0)
            {
                count++;
                break;
            }
         }
        if (count == 0)
        {
            System.out.print(+i+" ");
        }

    }
}
}
public class Program_16
{
	public static void main(String[] args) {
	    
		thread1 t1 =new thread1();
		t1.start();
		thread2 t2 = new thread2();
		t2.start();
	}
}
