package maps;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.*;


public class Map1 {

	public static void main(String[] args) {
		Map<Integer,String> M=new HashMap<>();
		M.put(508255, "chandur");
		M.put(508100, "nalgonda");
		M.put(59456, "hyd");
		Set<Integer>keys=M.keySet();
		for(Integer key:keys)
		System.out.println(key);
		Collection<String>values= M.values();
		for (String value:values)
			System.out.println(value);
		M.replace(59456, null);
		System.out.println(M);
		
		//retrival of value from the map based on the key
		System.out.println(M.get(508255));
		for(Integer key:keys)
			System.out.println(M.get(key));
		M.remove(59456);
		System.out.println(M);
		System.out.println(M.containsKey(508255));
		System.out.println(M.containsValue("nalgonda"));
		System.out.println(M.containsKey(123456));
		M.putIfAbsent(000000, "goa");
		System.out.println(M);
		System.out.println(M.size());
		//keyvalue pair is called as entry
		
		
		
		M.clear();
		System.out.println(M);
			
			}

		
			

	}



