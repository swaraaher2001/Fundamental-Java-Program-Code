package assignment_no1;

import java.util.Scanner;

public class Question_19_print_sum_of_all_natural_no_1_to_n {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No:");
		int n=sc.nextInt();
		int sum=0;
		
		for(int i=0;i<n;i++) {
			
			sum=sum+i;
			
		}
		System.out.println("Sum Of N Number:"+sum);
		
		
		

	}

}
