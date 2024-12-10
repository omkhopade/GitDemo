import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;


public class RemoveDuplicate {

	public static void main(String[] args) {
		
		
	
		Scanner sc = new Scanner (System.in);
		
		String str= sc.next();
		
		
		LinkedHashSet<Character> opt = new LinkedHashSet<Character>();
		
		for(int i=0;i<str.length();i++)
		{
			opt.add(str.charAt(i));
			
			
		}
		
		
		for(Character ch: opt)
		{
			System.out.print(ch+" ");
		}
		
		
		
		
		String  str1= sc.next();
		
		HashSet<Character> set = new HashSet<Character>();
		
		for(int i=0;i<str1.length();i++)
		{
			set.add(str1.charAt(i));
		}
		
		
		Iterator it= set.iterator();
		
		while(it.hasNext())
		{
			System.out.print (it.next()+" ");
		}
				
				
	}

}
