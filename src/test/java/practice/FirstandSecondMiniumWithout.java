package practice;

public class FirstandSecondMiniumWithout {

	public static void main(String[] args) {
		int [] arr= {2,3,4,5};
		int fmin= 100;
		int smin =100;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<fmin) {
				smin =fmin;
				fmin= arr[i];
				
			}
			else if(arr[i]<smin) {
				smin =arr[i];
				
			}
		}
		System.out.println(fmin);
		System.out.println(smin);
	}

}
