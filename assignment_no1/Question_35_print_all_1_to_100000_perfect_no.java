package assignment_no1;

import java.util.Scanner;

public class Question_35_print_all_1_to_100000_perfect_no {
	public static boolean perfect(long n) {
		long num=n;
		int sum=0;
		
		int i=1;
		
		while(i<=num/2) {
			if(num%i==0) {
				sum=sum+i;
			}
			i++;
		}
		
		
		return sum==num;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		long no=sc.nextLong();
		
		for(int i=1;i<=no;i++) {
			if(perfect(i)) {
				System.out.print(i+" ");
			}
		}
		
	}
}