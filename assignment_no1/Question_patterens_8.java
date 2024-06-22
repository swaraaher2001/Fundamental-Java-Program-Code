package assignment_no1;

public class Question_patterens_8 {

	public static void main(String[] args) {
		
		int n=5;
		int alpha=65;
		
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print((char)(alpha));
				alpha++;
			}
			System.out.println();
		}

	}

}
