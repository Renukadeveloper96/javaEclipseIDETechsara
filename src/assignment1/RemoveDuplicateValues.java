package assignment1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateValues {

	public static void main(String[] args) {
		
//		int a[]= {1,2,3,3,4,5,6,6,7};
		List<Integer>list=Arrays.asList(10,28,87,10,20,76,28,80,80);
		Set<Integer>set=new HashSet<>();
		list.stream().filter(x->set.add(x)).forEach(x->System.out.println(x));

	}

}
