package ArrayProgram;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetpractice {

	public static void main(String[] args) {
		LinkedHashSet<Object> set = new LinkedHashSet<Object>();
		set.add(10);
		set.add(20);
		set.add("hello");
		set.add(30);
		set.add(null);
		set.add(null);
		System.out.println(set);
		System.out.println(set.isEmpty());
		System.out.println(set.remove(20));
		System.out.println(set.size());
		if(set.contains("hello")) {
			System.out.println("present");
		}
		else {
			System.out.println("not present");
		}
		System.out.println();
		for(Object obj:set) {
			System.out.println(obj);
		}
		System.out.println();
		Iterator<Object> i = set.iterator(); //using iterator to fetch data
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
