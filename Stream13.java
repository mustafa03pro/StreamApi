package com.mustafa.stream;

import java.util.Arrays;
import java.util.List;

public class Stream13 
{
			public static void main(String[] args) 
			{
				List<Integer> list = Arrays.asList(1,2,3,4,5);
				list.stream().map(k -> k*2+3-k).forEach(k -> System.out.print(k +" "));
		    }
    }
