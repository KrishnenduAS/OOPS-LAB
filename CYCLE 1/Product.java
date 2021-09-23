import java.util.*;
class Product
{
    String pcode;
    String pname;
    int price;
    Product(String c,String n,int p)
    {
        pcode=c;
        pname=n;
        price=p;
    }
    
}
class Main
{
public static void main (String[] args)
{
    Product p1=new Product("CRT72","abc",1000);
    Product p2=new Product("TYH4205","thara",7500);
    Product p3=new Product("VMK2022","nila",3200);
    		if(p1.price>p2.price&&p1.price>p3.price)
		{
			System.out.println("LOWEST PRICE IS "+p1.price+" FOR PRODUCT  "+p1.pcode);
		}
		else  if(p2.price>p1.price&&p2.price>p3.price)
		{
			System.out.println("LOWEST PRICE IS "+p2.price+" FOR PRODUCT  "+p2.pcode);
		}
		else
		{
			System.out.println("LOWEST PRICE IS "+p3.price+" FOR PRODUCT  "+p3.pcode);
		}   
    
		
}
}
