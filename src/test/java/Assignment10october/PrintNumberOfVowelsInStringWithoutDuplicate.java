package Assignment10october;

public class PrintNumberOfVowelsInStringWithoutDuplicate {

	public static void main(String[] args) {
		String str = "india";
		int count =0;
		char[] ch =str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i' || ch[i]=='o'|| ch[i]=='u') {
				count++;
				
			}
					}
		if(count==1) {
			System.out.println(count);
		
				}
		
		
		}
	
}

