package assignment_no1;

import java.util.Scanner;

public class Question_53_ented_char_no_alphabet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Charachter");
		char ch=sc.next().charAt(0);
		
		if(ch>='A' && ch<='Z'||ch>='a' && ch<='z') {
			System.out.println("Alphabet");
		}
		else {
			System.out.println("Number");
		}
		
	}

}
