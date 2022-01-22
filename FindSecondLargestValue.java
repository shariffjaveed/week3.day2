package week1.day2;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class FindSecondLargestValue {

	public static void main(String[] args) {
		{
			List<Integer> arr = new ArrayList<Integer>(Arrays.asList(3,2,11,4,6,7));
			Collections.sort(arr);
			int size = arr.size();
			System.out.println("Second Largest number : "+arr.get(size-2));
		}
		

	}

}
