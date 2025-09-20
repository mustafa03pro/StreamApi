package com.mustafa.stream;



import java.util.Arrays;
import java.util.Optional;

public class Stream11 
{
			public static void main(String[] args) 
			{
				Integer[] numbers = {10, 25, 55, 40, 65, 30,75};

		        int max = Arrays.stream(numbers).max(Integer::compareTo).orElse(0);
		        
		         Optional<Integer> secondMax = Arrays.stream(numbers)
		                              .filter(n -> n < max)  
		                              .max(Integer::compareTo);  
		                              
		       secondMax.ifPresent(System.out::println);
		}
 }