package Practice;

import java.util.Arrays;
import java.util.List;

public class Intersection {
public static void main(String[] args) {
	List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
	List<Integer> list2 = Arrays.asList(4, 5, 6, 7);
	for(int i=0;i<=list1.size()-1;i++) {
		if(list2.contains(list1.get(i))) {
			System.out.println(list1.get(i));
			
		}
		
	}

}
}

