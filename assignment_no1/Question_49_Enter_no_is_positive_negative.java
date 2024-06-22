package assignment_no1;

import java.util.Scanner;

public class Question_49_Enter_no_is_positive_negative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int n=sc.nextInt();
		
		if(n>0) {
			System.out.println("Positive...");
		}
		else if(n<0) {
			System.out.println("Negative...");
		}
		else {
			System.out.println("Zero...");
		}

	}

}
