package com.mustafa.stream;

import java.util.Arrays;
import java.util.Comparator;

public class StremProblem2 {

	public static void main(String[] args) {
		int []arr= {1,2,4,5,6,7,8,9,3};
		int[] array = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(array));

	}

}
