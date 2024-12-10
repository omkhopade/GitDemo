package StringPractice;

public class StringAllocation {
	
	public static void  addition(int a,int b)
	{
		int y=a+b;
		System.out.println("Addition is --> "+y);
	}
	public static void main(String[] args) {
		
		String s1="hello";
		String s2="hello";
		String s3=s1;
		
		System.out.println(s3==s2);
		String s4= new String("hello");
		System.out.println(s3==s4);
		
		s2.concat("Java");
		
		System.out.println(s2);
		char arr[] = {'a','b','c'};
		String str= new String(arr);
		System.out.println(str);
	
		

	}

}
