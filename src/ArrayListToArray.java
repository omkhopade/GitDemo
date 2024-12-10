import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<String>();
		list.add("Omk");
		list.add("ar");
		list.add("Khop");
		list.add("Dhay");
		
		Object[]  obj=list.toArray();
		
		for(Object obj1 : obj)
		{
			System.out.println(obj1);
		}
		
		

	}

}
