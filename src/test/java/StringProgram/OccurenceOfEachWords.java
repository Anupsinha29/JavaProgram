package StringProgram;

import java.util.LinkedHashSet;

public class OccurenceOfEachWords {

	public static void main(String[] args) {
		String st="I Love I Love Bangalore City";
		String[] s = st.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<>();
		for(int i=0;i<s.length;i++) {
			set.add(s[i]);
			
		}
		for(String stri : set) {
			int  count =0;
			for(int i=0;i<s.length;i++) {
				if(stri.equals(s[i])) {
					count++;
					
				}
			}
		
		System.out.println(stri+"= is repeating "+count+" time");
		
		}		
		

	}

}
