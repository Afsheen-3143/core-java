package maps;

		  // same for Hash map,Tree map,Linked Hash map  just replace Hash table while creation

		import java.util.Collection;
		import java.util.Hashtable; 
		import java.util.Map;
		import java.util.Map.Entry;
		import java.util.Set;

		public class Map2 {

			public static void main(String[] args) {
				// creation of map
				Map<Integer,String>  m= new Hashtable<>(); 
				
				//Addition of elements of a map
				m.put(101,"aa" );
				m.put(102, "bb");
				m.put(103, "cc");
				m.put(104, "dd");
				m.put(105, "ee");
				System.out.println(m);
				
				//Retrieval of keys from the map
				Set<Integer> keys = m.keySet();
				for(Integer k : keys) {  // using keySet method
					System.out.println("keys: ");
					System.out.println(k);
				}
				
				//Retrieval of values from the map
				Collection<String> values = m.values();
				for(String V : values) {
					
					System.out.println(V);
				}
				
				//Retrieval of value from a map based on key
				System.out.println(m.get(104));
				 //OR
				for(Integer k :keys) {  // using get method
				
				System.out.println(k +  ">>" +m.get(k));
				}
		        
				
				m.remove(104);  // removes both key and value
				System.out.println(m);
				
				System.out.println(m.containsKey(101));
				System.out.println(m.containsValue("ee"));  // case sensitive
				
				m.put(101, "bb");  // replaces if value present
				System.out.println(m);
				
				m.putIfAbsent(101, "aa");  // replaces if absent
				System.out.println(m);
				
				
				m.replace(101, "Teja");
				System.out.println(m.size());
				
				
				//One key and value pairs is called Entry
				Set<Entry <Integer,String>> E = m.entrySet();
				for(Entry<Integer,String> e :E) {
					Integer k = e.getKey();
					String v =e.getValue();
					System.out.println(k+ ">>" +v);
					
				}
				m.clear();
				System.out.println(m);
			}

		

	}


