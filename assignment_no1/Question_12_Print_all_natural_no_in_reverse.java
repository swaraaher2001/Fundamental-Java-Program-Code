package assignment_no1;

import java.util.Scanner;

public class Question_12_Print_all_natural_no_in_reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter No:");
		int n=sc.nextInt();
		
		for(int i=n;i>0;i--) {
			System.out.print(i+" ");
		}
		

	}

}
