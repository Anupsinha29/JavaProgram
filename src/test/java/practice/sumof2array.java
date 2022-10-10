package practice;

public class sumof2array {

	public static void main(String[] args) {
		int [] a = {10,20,30,40};
		int [] b = {50,60,70,80,90,100};
		int length = a.length;
		if(a.length<b.length) {
			length = b.length;
		}
		for(int i=0;i<length;i++) {
			try {
			System.out.println(a[i]+b[i]);
		}
		catch(Exception e) {
			if(a.length<b.length) {
				System.out.println(b[i]);
			}
			else {
				System.out.println(a[i]);
			}
		}
	}
}
}
