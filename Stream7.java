package com.mustafa.stream;


import java.util.stream.IntStream;

public class Stream7
{
			public static void main(String[] args) 
			{
				int[] num = {10}; 

                IntStream.generate(() -> num[0]++)
                 .limit(3)
                 .forEach(System.out::println);
		}
    }
