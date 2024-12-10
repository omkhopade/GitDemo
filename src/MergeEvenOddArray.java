import java.util.Scanner;

public class MergeEvenOddArray {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter size of array ");
		int size = sc.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter the array1 element ");
		for(int i=0; i<arr.length;i++ ) {
			
			arr[i]=sc.nextInt();
		}
		
		int size1 = sc.nextInt();
		int arr1[]= new int[size1];
		System.out.println("Enter the array2 element ");
		for(int i=0; i<arr1.length;i++ ) {
			
			arr1[i]=sc.nextInt();
		}
		
		int size3=size+size1;
		int arr3[] = new int[size3];
		
		
		
		
		

	}

}
