package assignment_no1;

import java.util.Scanner;

public class Question_33_fibinaci_series_upto_n_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No:");
		int n=sc.nextInt();
		
		int f1=0;
		int f2=1;
		System.out.print(f1);
		System.out.print(f2);
		
		for(int i=2;i<=n;i++) {
			int f3=f1+f2;
			System.out.print(f3+" ");
			f1=f2;
			f2=f3;
		}

	}

}
