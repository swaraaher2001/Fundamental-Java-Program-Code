package assignment_no1;

import java.util.Scanner;

public class Question_34_print_all_strong_no_1_100000 {

	public static boolean strong(int n) {
		int temp=n;
		int factorial;
		int digit;
		int sum = 0;
		while(temp!=0) {
			factorial=1;
			
			
			digit=temp%10;
			
			for(int i=1;i<=digit;i++) {
				factorial=factorial*i;
			}
			
			sum=sum+factorial;
			
			temp=temp/10;
			
		}
		return sum==n;
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No:");
		int n=sc.nextInt();
		
		for(int i=1;i<n;i++) {
			if(strong(i)) {
				System.out.print(i+" ");
			}
		}
		

	}

}
