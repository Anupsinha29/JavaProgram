package StringProgram;

public class ReverseTheGivenSentence {

	public static void main(String[] args) {
		String s= "I love Bangalore"; //bangalore love i
		String[] st=s.split(" ");
		for(int i=st.length-1;i>=0;i--) {
			System.out.print(st[i]+" ");
		}
		
	}

}
