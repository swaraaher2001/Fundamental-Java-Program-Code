package assignment_no1;

public class Question_7_find_duplicate_value_in_array {

	public static void main(String[] args) {
		int arr[]= {1,2,3,1,4,5,4,6,5,3};
		
		System.out.println("Duplicate Value:");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
				}
			}
		}
		

	}

}
