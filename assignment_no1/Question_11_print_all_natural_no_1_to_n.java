package assignment_no1;

import java.util.Scanner;

public class Question_11_print_all_natural_no_1_to_n {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter No:");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
		}
	
	}

}
