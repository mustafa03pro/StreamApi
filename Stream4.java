package com.mustafa.stream;


import java.util.ArrayList;
import java.util.List;

public class Stream4 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(-1);
		al.add(-2);
		al.add(-5);
		al.add(0);
		al.add(1);
		al.add(2);
		List<Integer> list = al.stream().limit(4).filter(y->y<=0).peek(x->{}).toList();
		System.out.println(list);
    }

}




















