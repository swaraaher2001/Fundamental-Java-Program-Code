package assignment_no1;

import java.util.Scanner;

public class Question_54_check_enter_chara_vowel_not {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter char:");
		
		char ch=sc.next().charAt(0);
		
		if(ch=='a'||ch=='A'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u') {
			System.out.println("Vowel");
			
		}
		else {
			System.out.println("Constaint");
		}

	}

}
