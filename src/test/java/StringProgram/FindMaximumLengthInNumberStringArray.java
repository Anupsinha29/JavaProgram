package StringProgram;

public class FindMaximumLengthInNumberStringArray {

	public static void main(String[] args) {
		int[]  s= {1234567, 34567,5678, 34, 789};
		int maxlength =s[0];
		for(int i=0;i<s.length;i++) {
			if(s[i]>maxlength) {
				maxlength =s[i];
				
			}
		}
		for(int i=0;i<s.length;i++) {
			if(s[i]==maxlength) {
				System.out.println(s[i]);
			}
		}
		
			}

}
