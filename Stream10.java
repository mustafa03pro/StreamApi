package com.mustafa.stream;


import java.util.Arrays;
import java.util.Optional;

public class Stream10 
{
			public static void main(String[] args) 
			{
				Integer[] numbers = {10, 25, 55, 40, 65, 30, 75};

		        Optional<Integer> opt = Arrays.stream(numbers)
		                                                .distinct()  
		                                                .sorted((a, b) -> b - a) 
		                                                .skip(2) 
		                                                .findFirst();
		        opt.ifPresent(System.out::println);
		}
    }