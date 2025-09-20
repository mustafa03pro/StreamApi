package com.mustafa.stream;



import java.util.Arrays;

public class Stream8
{
			public static void main(String[] args) 
			{
				int[] arr = {11, 12, 13, 12, 14, 11, 15, 16, 12};
		        int target = 12;  

		        long count = Arrays.stream(arr)  
		                .filter(num -> num == target)  
		                .count(); 
		        System.out.println(count);
		}
    }