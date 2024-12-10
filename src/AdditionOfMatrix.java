
public class AdditionOfMatrix {

	public static void main(String[] args) {
		
		
		int arr[][]= { {1,2,3},  // d1=15, d2=15
						{4,5,6},
						{7,8,9},
						
				
						};
		
		System.out.println(arr.length);
		int d1=0;
		int d2=0;
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					d1=d1+arr[i][j];
				}
			
				if((i+j)==(arr.length-1))
				{
					d2=d2+arr[i][j];
				}
			
				
			}
		}
		
		
		System.out.println("Addtion is diagonal --> "+d1);
		System.out.println("Addition of diagonal 2 is --> "+d2);
	
	
	
	}

}
