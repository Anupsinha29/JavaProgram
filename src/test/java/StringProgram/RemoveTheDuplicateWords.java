package StringProgram;

import java.util.LinkedHashSet;

public class RemoveTheDuplicateWords {

	public static void main(String[] args) {
	String str = " I Love Love I Banaglore City";
	String[] s = str.split(" ");
	LinkedHashSet<String> set = new LinkedHashSet<>();
	for(int i=0;i<s.length;i++) {
		set.add(s[i]);
		
	}
	for(String stri: set) {
		System.out.print(stri+" ");
	}
	
	}

}
