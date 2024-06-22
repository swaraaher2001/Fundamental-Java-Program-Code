package assignment_no1;

public class Question_patterens_15 {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=1;i<=n;i++) {
			for(int k=i;k<n;k++) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
