package assignment_no1;

public class Question_4_array_in_ascending_order {

	public static void main(String[] args) {
		int arr[]= {2,4,8,6,1,9,3};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}

	}

}
