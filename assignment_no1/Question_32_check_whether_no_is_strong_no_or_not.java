package assignment_no1;

import java.util.Scanner;

public class Question_32_check_whether_no_is_strong_no_or_not {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No:");
		int no=sc.nextInt();
		
		int temp=no;
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
		
		if(no==sum) {
			System.out.println("Strong");
		}
		else {
			System.out.println("Not Strong!!!");
		}

	}

}
