import java.util.Iterator;
import java.util.LinkedHashSet;

public class DuplicateInArray {

	public static void main(String[] args) {
		
		
		int arr[]= {10,20,30,50};
		int arr1[]= {40,60,70,10,20};

		
		LinkedHashSet<Integer> set= new LinkedHashSet<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
		}
		
		for (int i=0;i<arr1.length;i++)
		{
			set.add(arr1[i]);
			
		}
		
		
		
		Iterator it =set.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
		System.out.println();
	}

}
