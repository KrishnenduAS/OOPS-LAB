import java.util.*;

class string_methods{

      String string;

      string_methods(String s)
      {

           string=s;

      }

      void count()
          {

          int i,j,l;

          String str[]=new String[50];

          str=string.split(" ");

          l=str.length;

          String temp;
          
int count[]=new int[l];

          for(i=0;i<l;i++)

              count[i]=1;

          for(i=0;i<l;i++){

                 temp=str[i];

                 for(j=i+1;j<l;j++)

                      {
 
                       if(temp.equals(str[j]))

                             {

                               count[i]+=1;

                               for(int k=j;k<l-1;k++)
 
                              str[k]=str[k+1];
 
                              l=l-1;
 
                            }
  
                    }
      
            System.out.println("count of "+temp+" is "+count[i]); 

          }
  
                          
      }

      void replace(String old,String new_)
	  {
 
           int i;

            String result=" ";

            String[] str_=new String[50];
 
            str_=string.split(" ");
 
            int len=str_.length;
      
            for(i=0;i<len;i++){
            
            if(old.equals(str_[i]))
       
                  str_[i]=new_;
          
          }

            System.out.println("sentence afer replacement:");

            for(i=0;i<len;i++)
      
            result=result + str_[i] +" ";
     
            System.out.println(result);
           

           }
     
     void reverse(){ 
  
          String str1[]=new String[50];

          str1=string.split(" ");
  
          String temp;
  
          String t;
    
          int i,j;
  
          int lr=str1.length;
  
          String rev[]=new String[lr];
   
          for(i=0;i<lr;i++)
     
          rev[i]=" ";
       
          String reverse=" ";
    
          for(i=0;i<lr;i++){
    
          temp=str1[i];
      
          t=" ";
             
          for(j=(temp.length())-1;j>=0;j--)
 
          t= t+temp.charAt(j);
   
          rev[i]=t;
   
       }
    
          for(i=0;i<lr;i++)

          reverse=reverse + rev[i] +" ";
 
          System.out.println("reverse of the given sentence:\n" +reverse);
 
       }

}

public class main_string_methods{
 
      public static void main(String[] args){
 
          int c;  
          Scanner sc=new Scanner(System.in);
 
          System.out.println("enter the sentence");
    
          String s=sc.nextLine();
  
          string_methods s1=new string_methods(s);

          System.out.println("1:COUNT\n2.REPLACE\n3.REVERSE\n4.exit");
 
          do
    
          {
          
          System.out.println("enter your choice:");
   
          c=sc.nextInt();
        
          sc.nextLine();
           
          switch(c){
            
               case 1:
               
     		s1.count();
               
     		break;
                 
		case 2:
                  
 		System.out.println("enter the word to replace:");
 
                String old=sc.nextLine();
       
            	System.out.println("enter the new word :");
    
                String new_=sc.nextLine();
             
       		s1.replace(old,new_);
                  
		 break;
              
	   case 3:
                 
   		 s1.reverse();
             
       		 break;
           
     		 case 4:
              
     		 System.out.println("********EXIT POINT*****");
 
                 break;
         
        	 default:
             
     		 System.out.println("enter a valied choice");
  
               
    }
              
      
     		 }
		while(c!=4);
 
         }

}