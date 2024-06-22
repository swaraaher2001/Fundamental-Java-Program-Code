package assignment_no1;

import java.util.Scanner;

public class Question_14_Multiplication_table_reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No:");
		int n=sc.nextInt();
		for(int i=10;i>0;i--) {
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}

}
