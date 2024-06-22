package assignment_no1;

import java.util.Scanner;

public class Question_63_5_subject_cal_per_grade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Physics");
		int s1=sc.nextInt();
		System.out.println("Chemistry");
		int s2=sc.nextInt();
		System.out.println("Biology");
		int s3=sc.nextInt();		
		System.out.println("Mathematics");
		int s4=sc.nextInt();
		System.out.println("Computer");
		int s5=sc.nextInt();
		
		int sum=s1+s2+s3+s4+s5;
		
		double percentage=sum/5;
		
		System.out.println("Sum :"+sum);
		System.out.println("Average :"+percentage);
		if(percentage>=90) {
			System.out.println("Grade A");
		}
		else if(percentage>=80) {
			System.out.println("Grade B");
		}
		else if(percentage>=70) {
			System.out.println("Grade C");
		}
		else if(percentage>=60) {
			System.out.println("Grade D");
		}
		else if(percentage>=40) {
			System.out.println("Grade E");
		}
		else {
			System.out.println("Grade Fail...!");
		}
	}

}
