import java.util.Scanner;

public class EvenOddArray {

	public static void main(String[] args) {


		Scanner sc= new Scanner(System.in);
		System.out.println("please enter size of array");
		int size= sc.nextInt();
		int even=0;
		int odd=0;
		int arr[]= new int [size];

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] % 2==0)
			{
				even=even+1;
			}
			else
			{
				odd=odd+1;
			}

		}


		int evenarr[]= new int[even];
		System.out.println("size of even arrray "+evenarr.length);
		int oddarr[]= new int [odd];
		System.out.println("size of odd arrray "+oddarr.length);
		int j=0,k=0;

		for(int i=0;i<arr.length;i++)
		{
			

				if(arr[i]%2==0)
				{
					evenarr[j++]=arr[i];
				}
			
				else
				{
					oddarr[k++]=arr[i];
				}

		}

		System.out.println("even array ");
		for(int i=0;i<evenarr.length;i++)
		{
			System.out.print(evenarr[i]+" ");
		}
		System.out.println();
		System.out.println(" odd array" );

		for(int i=0;i<oddarr.length;i++)
		{
			System.out.print(oddarr[i]+" ");
		}






	}

}
