import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class replaceStringBuilder {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		//String s1=sc.next();
		String s2=sc.next();
		
		StringBuilder sb= new StringBuilder();
		sb.replace(0,3,s2);
		System.out.println("after replace --> "+sb.toString());
		
		
	}

}
