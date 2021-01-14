package Java_Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hasmap {

	public static void main(String[] args) {
	Map<String, Integer> map = new HashMap<>();
	map.put("Noida", 5000);
	map.put("Gurgaon", 2000);
	map.put("chenni", 20000);
	map.put("chenni", 0);
	
	Integer sum =0 ;
//	System.out.println(map);
Set<String >city =map.keySet();

for(String s: city)	
{
	if(s.equalsIgnoreCase("Noida") || s.equalsIgnoreCase("Gurgaon"))
	{
	 sum = sum + map.get(s);
	}

}
System.out.println(sum);

}
}