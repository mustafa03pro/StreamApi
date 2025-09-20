package com.mustafa.stream;


import java.util.Arrays;
import java.util.Comparator;

public class Strem2 
{
	public static void main(String[] args) 
	{
		int []arr1 = {50,30,10,50,60,20,30};
	        int[] array1 = Arrays.stream(arr1).boxed().
	        distinct().
	        sorted(Comparator.reverseOrder()).mapToInt(Integer::valueOf).toArray();
	        System.out.println(Arrays.toString(array1));
    }

}