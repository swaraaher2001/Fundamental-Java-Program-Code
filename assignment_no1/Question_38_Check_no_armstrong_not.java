package assignment_no1;

import java.util.Scanner;

public class Question_38_Check_no_armstrong_not {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		int no=sc.nextInt();
		
		int arm=0;
		int remi;
		int temp=no;
		
		while(temp!=0) {
			remi=temp%10;
			arm+=remi*remi*remi;
			temp=temp/10;
		}
		 
		if(arm==no) {
			System.out.println("Armstrong No...");
			
		}
		else {
			System.out.println("Not Armstrong...");
		}
		
		
		

	}

}
