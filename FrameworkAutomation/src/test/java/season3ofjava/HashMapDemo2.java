package season3ofjava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hMap= new HashMap<String, String>();
		hMap.put("tester", "sai");
		hMap.put("manager", "gopi");
		hMap.put("hr", "siva");
		System.out.println(hMap);
		Set<Entry<String,String>> allEntries=hMap.entrySet();
		Iterator<Entry<String,String>> it=allEntries.iterator();
		while(it.hasNext()) {
			Entry<String,String> entry=it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}

}
