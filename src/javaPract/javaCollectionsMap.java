package javaPract;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class javaCollectionsMap {

	public static void main(String[] args) {
		//Collections : Map
		
		Map<String,Integer> mapTry1 = new HashMap<String,Integer>();
		
		mapTry1.put("Arvi",1234);
		mapTry1.put("Amar",1235);
		mapTry1.put("Suda",1236);
		mapTry1.put("Maha",1237);
		mapTry1.put("Amar",1238);
		mapTry1.put("Suda",1234);
		
		System.out.println(mapTry1.size());
		
		System.out.println(mapTry1.get("Amar"));
		
		System.out.println(mapTry1.values());
		
		Set<Entry<String, Integer>> newSet = mapTry1.entrySet();
		
		for(Entry<String, Integer> x: newSet) {
			System.out.println(x);
		}
		
		
		System.out.println(mapTry1.get("Arvi"));
		
		System.out.println(mapTry1.containsKey("Amar"));
		
		System.out.println(mapTry1.containsValue(1234));
		
		System.out.println(mapTry1.keySet());
		
		System.out.println(mapTry1);
		
	
	}

}
