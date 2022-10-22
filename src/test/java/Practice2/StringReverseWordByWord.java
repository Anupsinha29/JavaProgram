package Practice2;

public class StringReverseWordByWord {

	public static void main(String[] args) {
		String s= "I Love Ranchi";
					
				String[]	 str =s.split(" ");
					for(int i=0;i<str.length;i++) {
						
						  char[] ab = str[i].toCharArray();
						
					
					for(int j=ab.length-1;j>=0;j--) {
						System.out.print(ab[j]);
						
					}
					System.out.print(" ");
	}}

}
