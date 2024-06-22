package assignment_no1;

import java.util.Scanner;

public class Question_37_print_all_armstrong_no_bet_1_10000 {

	public static boolean arm(int n) {
		
		int temp=n,remi,armst=0;
		
		while(temp!=0) {
			remi=temp%10;
			armst+=remi*remi*remi;
			temp=temp/10;
		}
		
		return armst==n;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		int no=sc.nextInt();
		
		for(int i=0;i<=no;i++) {
			if(arm(i)) {
				System.out.print(i+" ");
			}
		}
		
	}

}
