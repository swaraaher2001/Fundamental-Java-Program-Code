package assignment_no1;

import java.util.Scanner;

public class Question_56_Enter_charachter_lowercase_uppercase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Charachter:");
		char ch=sc.next().charAt(0);
		
		if(ch>='A' && ch<='Z') {
			System.out.println("Uppercase");
		}
		else if(ch>='a' && ch<='z') {
			System.out.println("Lowercase");
		}
	}

}
