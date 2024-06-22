package assignment_no1;

import java.util.Scanner;

public class Question_23_Print_factorial_of_n_no {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			
			fact=fact*i;
		}

		System.out.println("Factorial Of"+n+" is:"+fact);
	}

}
