import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdditionOfRepeatedInteger {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		int arr[] = new int [size];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
			
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					sum=sum+arr[j];
				}
			}
		}
		
		System.out.println(sum);
			
		
			
		
		
		
	}

}
