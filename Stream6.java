package com.mustafa.stream;

import java.util.stream.IntStream;

public class Stream6
{
			public static void main(String[] args) 
			{
				 IntStream.generate(() -> 40)
		         .limit(3)
		         .forEach(System.out::print);
		}
    }