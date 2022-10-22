package StringProgram;

import java.util.LinkedHashSet;

public class FindMiniumLengthInStringArray {

	public static void main(String[] args) {
		String[] s= {"abcdef", "avbc"," qfq", "ab", "asdfg"};
		String minlength =s[0];
		for(int i=0;i<s.length;i++) {
			if(s[i].length()<minlength.length()) {
				minlength =s[i];
				
			}
		}
		for(int i=0;i<s.length;i++) {
			if(s[i].length()==minlength.length()) {
				System.out.println(s[i]);
			}
		}
	}

}
