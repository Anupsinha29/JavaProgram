package StringProgram;

public class SegreateNumberAlphabetsAndSpecialCharacter {

	public static void main(String[] args) {
		String str ="a%#1sv%2i";
		String alpha =" ";
		String num =" ";
		String spc=" ";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)>='Z' || str.charAt(i)>='a' && str.charAt(i) >='z')
				
{
				alpha =alpha+str.charAt(i);
				
	
}
			else if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				num = num+str.charAt(i);
				
				
			}
			else {
				spc =spc+str.charAt(i);
				
			}
			
		}
		System.out.println(alpha +num+spc);
		
	}

}
