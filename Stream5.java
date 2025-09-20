package com.mustafa.stream;



import java.util.Comparator;
import java.util.TreeSet;

public class Stream5 
{
			public static void main(String[] args) 
			{
			TreeSet<Integer> treeSet=new TreeSet<Integer>((x,y)->y.compareTo(x));
			treeSet.add(10); 
			treeSet.add(14);
			treeSet.add(13);
			treeSet.stream().sorted(new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					return o2 - o1;
				}
			}).forEach(num -> System.out.print(num+" "));
		}
    }
