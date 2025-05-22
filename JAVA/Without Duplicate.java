package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class ArrayDEmo {
	

	public static void main(String[] args) {
			List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5);
			LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
			hs.addAll(numbers);
			System.out.println(hs);
         
	}

}

