package StringProgram;

import java.util.LinkedHashSet;

public class PositionOfEachWord {

	public static void main(String[] args) {
		String str ="I Love I Love Banaglore City";
		String [] s =str.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<>();
		for(int i=0;i<s.length;i++) {
			set.add(s[i]);
			
		}
		for(String stri: set) {
			for(int i=0;i<s.length;i++) {
				if(stri.equals(s[i])) {
					System.out.println(stri+" is present in "+(i+1)+"position");
					break;
				}
				
			}
		}

	}

}
