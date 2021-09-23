class cpu
{   int price;
    class pro
    {
        int cores;
        String promanu;
        void disp(int c,String p)
        {
             System.out.println("CPU cores:"+c);
             System.out.println("CPU manufacturer:"+p);
        }
        
    }
    static class ram
    {
        int mem;
        String rammanu;
        void disp(int me,String ra)
        {
            System.out.println("Ram Memory:"+me);
            System.out.println("Ram Manufacturer:"+ra);
        }
    }
    void disp(int p)
    {
        System.out.println("CPU PRICE:"+p);
    }
}
class Program_5{
public static void main (String[] args) 
    {
        cpu c = new cpu();
        c.disp(100);
        cpu.pro p = c.new pro();
        p.disp(60,"INTEL");
        cpu.ram r =new cpu.ram();
        r.disp(77,"IFB");
        
    }
}
