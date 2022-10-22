package Practice2;

public class asdf {

	public static void main(String[] args) {
		String s="aBcAbCjhj";
		String[] st = s.split(" ");
		String A=" ";
		String B ="";
		for(int i=st.length;i<=0;i++)
		{
			if(s.charAt(i)>='A'||s.charAt(i)<='Z')
			{
				A=A+s.charAt(i);
			}
			else if(s.charAt(i)>='a'||s.charAt(i)<='z')
			{
				B=B+s.charAt(i);
			}
		}

		System.out.println(s);



	}
}
