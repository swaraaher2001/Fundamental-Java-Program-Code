package assignment_no1;

import java.util.Scanner;

public class Question_40_No_is_palindrome_not {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		int no=sc.nextInt();
		
		int temp=no;
		int rev=0,remi;
		
		while(temp!=0) {
			remi=temp%10;
			rev=rev*10+remi;
			temp=temp/10;
		}
		System.out.println("Reverse :"+rev);
		if(rev==no) {
			System.out.println("Pallindrom...");
		}
		else {
			System.out.println("Not Pallindrom...");
		}
		
		
		
	}

}
