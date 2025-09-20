package com.mustafa.stream;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int []arr= {10, 15, 8, 49, 25, 98, 32, 15, 8};
		int[] array = Arrays.stream(arr).distinct().filter(n->n%2==0).toArray();
		System.out.println(Arrays.toString(array));
		
		

	}

}
