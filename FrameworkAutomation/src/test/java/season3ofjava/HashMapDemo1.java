package season3ofjava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> hMap=new HashMap<Integer,String>();
		hMap.put(100,"ravi");
		hMap.put(101, "sai");
		hMap.put(102, "manu");
		System.out.println(hMap);
		System.out.println(hMap.get(100));
		System.out.println(hMap.get(101));
		System.out.println(hMap.get(102));
		Set<Entry<Integer,String>> allEntries=hMap.entrySet();
		for(Entry<Integer,String> temp:allEntries)
		{
			System.out.println(temp.getKey()+" "+temp.getValue());
		}

	}

}
