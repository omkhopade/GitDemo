import java.util.Scanner;

public class ReverseSubString {

	public static StringBuilder sb= new StringBuilder();
	 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String");
		String str=sc.next();
		sb.append(str);
		
		int start=0,  end=0;
		
		while(end < sb.length())
		{
		while (end < str.length() && !Character.isDigit(str.charAt(end))) {
			
			end++;
			
		}
		
		sb.replace(start, end, new StringBuilder(sb.substring(start,end)).reverse().toString());
		
		start=end+1;
		end=start;
		
		
		}
		
		System.out.println("newly genearted string "+sb);
		

	}

}
