package StringProgram;

public class StringMethod {

	public static void main(String[] args) {
		String s="welcome";
		System.out.println(s.length());
		
		
		String s1 =" hi hello welcome ";
		System.out.println(s1.trim());//used to remove the starting and ending space
		
		String s2 ="welcome";
		System.out.println(s.contains("lc"));
		
		String s3 ="welcome";
		System.out.println(s.startsWith("we"));
		
		String s4 = "welcome";
		System.out.println(s.endsWith("me"));
		
//		String s5 ="welcome";
//		String s6 ="";
//		System.out.println(s.isBlank());//true

		String s7 ="welcome";
		String s8="";
		System.out.println(s7.isEmpty());
		
		
		String s9 ="hi hello welcome";
		String[] s10 = s9.split(" ");
		for(int i=0;i<s10.length;i++)
		{
			System.out.println(s10[i]);
		}
		
		String s11="hi";
		String s12 ="hi";
		System.out.println(s11.equals(s12));
	
		
		String s13 ="hi hello welcome";
		System.out.println(s.replace(" ",""));
		
		String s14 ="WELCOME";
		System.out.println(s14.toLowerCase());

		String s15 ="welcome";
		System.out.println(s.toUpperCase());

	}

}
