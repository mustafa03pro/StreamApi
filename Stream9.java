package com.mustafa.stream;


import java.util.Arrays;
import java.util.Optional;

public class Stream9 
{
			public static void main(String[] args) 
			{
				Integer[] numbers = {10, 25, 55, 40, 65, 30, 75};		        
		        Optional<Integer> firstGreater = Arrays.stream(numbers)
		                                               .filter(n -> n > 50)
		                                               .findFirst();
		        firstGreater.ifPresent(System.out::println);
		}
    }
