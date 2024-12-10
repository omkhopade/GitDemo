import java.util.Scanner;

public class UpperLowerCount {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String str=  sc.nextLine();
		
		char ch[]= str.toCharArray();
		int upper=0;
		int lower=0;
		for(int i=0;i<ch.length;i++)
		{
			int as=ch[i];
			
			if(as >= 65 && as<= 90)
			{
				upper=upper+1;
			}
			
			else if(as >= 97 && as<= 122)
			{
				lower=lower+1;
			}
			
		}
		
		System.out.println("Upper case count --> "+upper);
		System.out.println("Lower Case count --> "+lower);
		
		

	}

}
