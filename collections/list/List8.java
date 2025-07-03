package lists;
import java.lang.reflect.Array;
import java.util.*;
public class List8 {
public static void main(String[] args) {
//	List<Integer>list=Arrays.asList(2,5,1,8,9);

int []array= {2,5,1,8,9};
List<Integer> list = new ArrayList<>();
for (Integer integer : array) {
	list.add(integer);
	
	
}

System.out.println(list);

}
}
