package StringProgram;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateCharInString {

	public static void main(String[] args) {
		String s ="Tester";
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
			System.out.println(set);

		}
		System.out.println();
		
		for(Character ch : set) {
			System.out.println(ch);
		}
		
	}

}
