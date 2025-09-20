package com.mustafa.stream;


import java.util.Arrays;

public class Stream12 
{
			public static void main(String[] args) 
			{
				Integer[] numbers = {10, 25, 35, 45,-60 };

		        boolean x = Arrays.stream(numbers)
		                                   .noneMatch(n -> n <0);
		        System.out.println(x);
		    }
    }