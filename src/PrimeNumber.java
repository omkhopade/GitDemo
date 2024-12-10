import java.util.Scanner;

public class PrimeNumber {

	 public static void  main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter number");	
		int num=sc.nextInt();
		
		int result=num/2;
		boolean flag=false;
		
		if(num==0 || num==1)
		{
			System.out.println("Given number is not  prime");
		}
		
		else
		{
			for(int i=2;i<=result;i++)
			{
				if(num%i==0)
				{
					flag=true;
					break;
				}	
			}
		}
		
		if(flag==true)
		{
			System.out.println("Given number is not a prime");
		}
		else
		{
			System.out.println("Given number is prime number");
		}
		
		
	}

}
