package Practice2;



public class MaximumLengthofInteger {

	public static void main(String[] args) {
		int[] s= {1234567,123,3456,5678};
		int maxlength = s[0];
		
		for(int i=0;i<s.length;i++) {
			if(s[i]>maxlength) {
				maxlength=s[i];
				
				
			}
		}
		for(int i=0;i<s.length;i++) {
			if(s[i]==maxlength) {
				System.out.println(s[i]);	
			}
			
			
		}
		
	}

}
