package com.mustafa.stream;

import java.util.ArrayList;
import java.util.List;

record employee(Integer id,String name,Double price) {
	
}
public class StreamProblem1 {

	public static void main(String[] args) {
		ArrayList<employee> l1=new ArrayList<employee>();
		l1.add(new employee(111, "scott", 5000d));		
		l1.add(new employee(2222, "smith", 45000d));		
		l1.add(new employee(333, "alen", 55000d));		
		l1.add(new employee(555, "baber", 75000d));	
		
		  List<String> list = l1.stream().filter(n->n.price()>50000).map(n->n.name().toUpperCase()).toList();
		list.forEach(System.out::println);
		
		
	}

}
