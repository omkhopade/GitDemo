import java.util.HashMap;
import java.util.Map;

public class CountCharacterIString {

	public static void main(String[] args) {
		
		
			String str="Quality Assurance Analyst";
		
			String str1[]=str.split(" ");
			
			
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			
			for(int i=0;i<str1.length;i++)
			{
				char ch[]=str1[i].toLowerCase().toCharArray();
				
				for(int j=0;j<ch.length;j++)
				{
					if(map.containsKey(ch[j]))
					{
						map.put(ch[j],map.get(ch[j])+1);
					}
					else
					{
						map.put(ch[j],1);
					}
				}
				
				System.out.println("for " +str1[i] +" characters are");
				for(Map.Entry<Character, Integer> entry : map.entrySet())
				{
					System.out.println(entry.getKey() +" : "+entry.getValue());
				}
				 
				map.clear();
				System.out.println();
			
			
			}
			
		

	}

}
