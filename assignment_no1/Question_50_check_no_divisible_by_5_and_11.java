package assignment_no1;

import java.util.Scanner;

public class Question_50_check_no_divisible_by_5_and_11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		int no=sc.nextInt();
		
		if(no%5==0 && no%11==0) {
			System.out.println("Divisible by 5 & 11");
		}
		else {
			System.out.println("Not Divisible by 5 & 11");
		}
	}

}
