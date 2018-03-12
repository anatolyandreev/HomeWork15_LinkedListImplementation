package by.htp.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import javax.management.ImmutableDescriptor;

public class MainApp {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		
				
//		for (String s: list) {
//			System.out.println(s);
//		}
//		
//		Iterator it = list.iterator();
//		
//		if (it.hasNext()) {
//			//System.out.println(it.next());
//		}
//		
//		do {
//			System.out.println(it.next());
//		} while (it.hasNext());
		
		ListIterator<String> lit = list.listIterator(list.size());
//		
//		do {
//			System.out.println(lit.previous());
//		} while(lit.hasPrevious());
//		
		List<String> al=new ArrayList<>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("asdf");  
		  al.add("sd");  
		  System.out.println(al);
		  System.out.println(Arrays.toString(al.toArray(new Object[2])));
		  
		  System.out.println("=====");

	}

}
