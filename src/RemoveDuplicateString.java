import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		LinkedHashSet<String> set=new  LinkedHashSet<String>();
		
		String str2[]=str.split(" ");
		
		for(int i=0;i<str2.length;i++)
		{
			set.add(str2[i]);
		}
			
		
		for(String str3 : set)
		{
			System.out.println(str3);
		}
			
		

	}

}
