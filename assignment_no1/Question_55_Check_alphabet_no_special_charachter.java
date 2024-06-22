package assignment_no1;

import java.util.Scanner;

public class Question_55_Check_alphabet_no_special_charachter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter charachter:");
		char ch=sc.next().charAt(0);
		
		if(ch>='A' && ch<='z' || ch>='a' && ch<='z') {
			System.out.println("Alphabet");
		}
		else if(ch>='0' && ch<='9') {
			System.out.println("Number");
		}
		else {
			System.out.println("Special Charachter");
		}
		

	}

}
