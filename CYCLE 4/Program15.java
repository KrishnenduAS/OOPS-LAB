import java.util.*;

class MyEx extends Exception {
     MyEx(String s) {
		super(s);
	}
}

class Program15 {
	public static void main(String args[]) {
		int totalNums;
		int i;
		int temp, count = 0;
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size & Numbers  : ");
		totalNums = Integer.parseInt(sc.nextLine());
		for (i = 0; i < totalNums; i++) {
			try {
				temp = Integer.parseInt(sc.nextLine());
				if (temp > 0) {
					sum =sum + temp;
					count=count+1;
				} else {
				    totalNums++;
					throw new MyEx("- Not a positive number\n");
				}
			} catch (MyEx ex) {
				System.out.print(ex);
			
			}
		}
		System.out.print("Average : ");
		System.out.println(sum / count);

	}
}
