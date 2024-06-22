package assignment_no1;

public class Question_patterens_18 {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
