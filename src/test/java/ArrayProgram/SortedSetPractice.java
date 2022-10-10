package ArrayProgram;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetPractice {

	public static void main(String[] args) {
		SortedSet<String> set = new TreeSet<>();
		set.add("infosys");
		set.add("ibm");
		set.add("wipro");
		set.add("google");
		set.add("microsoft");
		set.add("cognizant");
		System.out.println(set);
		for(String str:set)
		{
			System.out.println(str);
		}
		System.out.println();
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.headSet("infosys"));
		System.out.println(set.tailSet("google"));
		
		

	}

}
