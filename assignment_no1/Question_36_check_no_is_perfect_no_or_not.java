package assignment_no1;

import java.util.Scanner;

public class Question_36_check_no_is_perfect_no_or_not {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		long no=sc.nextLong();
		long temp=no;
		int sum=0;
		
		for(int i=1;i<=no/2;i++) {
			if(no%i==0) {
			sum=sum+i;	
			}
			
			
		}
		System.out.println("Sum is:"+sum);
		if(temp==sum) {
			System.out.println("Perfect no....");
		}
		else {
			System.out.println("Not Perfect...");
		}
		
		
	}
}
