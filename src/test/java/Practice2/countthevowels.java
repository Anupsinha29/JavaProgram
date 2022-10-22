package Practice2;

public class countthevowels {
	public static void main(String[] args) {
		String s ="india";
		int count =0;
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				count++;
				
			}
		}
		System.out.println(count);
	}

}
