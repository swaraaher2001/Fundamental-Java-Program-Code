package assignment_no1;

import java.util.Scanner;

public class Question_47_maximum_no_bet_two_ni {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First No:");
		int fn=sc.nextInt();
		
		System.out.println("Enter Second No:");
		int sn=sc.nextInt();
		
		if( fn>sn) {
			System.out.println("First No is Maximum....");
		}

	}

}
