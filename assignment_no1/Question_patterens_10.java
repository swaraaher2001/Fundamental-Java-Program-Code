package assignment_no1;

public class Question_patterens_10 {

	public static void main(String[] args) {
		int n=5;
		
		int alpha=65;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(alpha+i));
			}
			System.out.println();
		}
	}

}
