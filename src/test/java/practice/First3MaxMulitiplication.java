package practice;

public class First3MaxMulitiplication {

	public static void main(String[] args) {
		int a[] = {2,4,1,3,6,8,2};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp =a[i];
					a[i] =a[j];
					a[j]=temp;


				}
			}

		}for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}

