import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		String str=sc.nextLine();
		
		String str2[]=str.split(" ");
		System.out.println(str2.length);
		
		for(int i=str2.length-1;i>=0;i--)
		{
			System.out.print(str2[i]+" ");
		}
		 System.out.println();
		 
		 sc.close();
	}

}
