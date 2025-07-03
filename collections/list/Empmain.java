package lists;
import java.util.*;
public class Empmain {

	public static void main(String[] args) {
		List<emp>Emp=new ArrayList<>();
		Emp.add(new emp(1,"teja","Australia",100000));
		Emp.add(new emp(1,"teju","Australia",100000));
		Emp.add(new emp(1,"affu","Dubai",50000));
		Emp.add(new emp(1,"Renuka","India",50000));
		Emp.add(new emp(1,"vas","uk",100000));
		Emp.add(new emp(1,"Mahesh","India",100000));
		for (emp emp2 : Emp) {
			System.out.println(Arrays.asList(emp2.country,emp2.id,emp2.name,emp2.salary));
			
		}
		int sum=0;
		for (emp emp2 : Emp) {
			if(emp2.country=="Australia") {
				sum+=emp2.salary;
			}
		}
System.out.println(sum);
	
	

//same countries
Map<String,List<String>>country=new HashMap<>();
for(emp e1: Emp) {
	   country.computeIfAbsent(e1.country, k -> new ArrayList<>()).add(e1.name);
}
for(Map.Entry<String,List<String>> ee : country.entrySet() ) {
	   System.out.println(ee.getKey()  + ":" + ee.getValue());
}}}