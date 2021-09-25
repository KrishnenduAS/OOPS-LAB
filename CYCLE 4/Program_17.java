import java.util.*;
class thread1 implements Runnable
{   
    int l1,l2;
    thread1(int n1,int n2)
    {
        l1=n1;
        l2=n2;
    }
    public void run()
    {
       
        int f=0,s=1,i;
        for(i=2;i<l2;i++)
        {    
            l1=f+s;    
            System.out.print(" "+l1);    
            f=s;    
            s=l1;    
        }    
        
    }
}
class thread2 implements Runnable
{
    int k1,k2;
    thread2(int m1,int m2)
    {
        k1=m1;
        k2=m2;
    }
    
    
    public void run()
    {
        int i;
        for(i=k1;i<k2;i++)
        {
         if(i%2==0)
         System.out.print(+i+" ");
        }
        System.out.println(" ");
    }
}
public class Program_17{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for fib and even numbers : ");
        int l1 = Integer.parseInt(sc.nextLine());
        int l2 = Integer.parseInt(sc.nextLine());
        thread1 t1 = new thread1(l1,l2);
        Thread T1 = new Thread(t1);
        System.out.println();
        System.out.println("------------");
        int k1 = Integer.parseInt(sc.nextLine());
        int k2 = Integer.parseInt(sc.nextLine()); 
        thread2 t2 = new thread2(k1,k2);
        Thread T2 = new Thread(t2);
        T1.start();
        T2.start();
        
        
        
    }
}
