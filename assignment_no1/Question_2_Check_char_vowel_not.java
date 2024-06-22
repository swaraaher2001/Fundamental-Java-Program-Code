package assignment_no1;

import java.util.Scanner;


public class Question_2_Check_char_vowel_not {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Charachter");
		char ch=sc.next().charAt(0);
		
		if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u') {
			System.out.println(ch+" is Vowel.");
		}
		else {
			System.out.println(ch+" is not Vowel.");
		}
		

	}

}
