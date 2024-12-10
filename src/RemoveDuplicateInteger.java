import java.util.Scanner;

public class RemoveDuplicateInteger {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int arr[]= new int[size];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=0;
		
		for(int i=0;i<size-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				arr[k++]=arr[i];
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		arr[k++]=arr[size-1];
		
		for(int i=0;i<k;i++)
		{
			arr[i]=7;
		}
		
	}

}
