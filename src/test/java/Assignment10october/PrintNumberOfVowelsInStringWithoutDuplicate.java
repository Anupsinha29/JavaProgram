package Assignment10october;

import java.util.LinkedHashSet;

public class PrintNumberOfVowelsInStringWithoutDuplicate {

	public static void main(String[] args) {
		String str = "india";
		
		char[] ch =str.toCharArray();
		LinkedHashSet<Character> set =new LinkedHashSet<>();
		for(int i=0;i<ch.length;i++) {
			set.add(ch[i]);
		}int count =0;
		
			for(Character s: set) {
				
			
			if(s=='a'|| s=='e'|| s=='i' || s=='o'|| s=='u') {
				count++;
				System.out.println(s);
				
			}
			
					}
		
			System.out.println("= " +count);
		
				}
		
		
		}
	


