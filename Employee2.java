import java.util.*;  
class Employee2{
    int eNo;
    String eName;
    int eSalary;

    public void read(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter ID : "); 
        eNo = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Name : "); 
        eName = sc.nextLine();
        System.out.print("Enter monthly salary : "); 
        eSalary = Integer.parseInt(sc.nextLine());
    }

    public void display(){
        System.out.println("Name : "+ eName );
    }
    public static void main(String []args){
        int i,n=3;
        int No;
         Employee2 emp[] = new  Employee2[n];
        for(i=0;i<n;i++){
            emp[i] = new  Employee2();
            emp[i].read();
        }
        System.out.println("Search"); 
        while(true){
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter ID : "); 
            No = Integer.parseInt(sc.nextLine());
            for(i=0;i<n;i++){
                if(emp[i].eNo == No){
                    emp[i].display();
                    break;
                }
            }
        }

    }
}