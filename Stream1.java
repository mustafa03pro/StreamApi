package com.mustafa.stream;



import java.util.Arrays;
import java.util.OptionalInt;

public class Stream1 
{
	public static void main(String[] args) 
	{
		Integer []arr = {10,20,30,40,50};
		OptionalInt min = Arrays.stream(arr).mapToInt(Integer::valueOf).min();
		min.ifPresent(System.out::println);
    }

}