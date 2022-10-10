package ArrayProgram;

public class FirstMin {

	public static void main(String[] args) {
		int[] ar = {3,6,8,9,67,90};
		 int fmin = ar[0];
		 for(int i=0;i<ar.length;i++) {
			 if(ar[i]<fmin) {
				 fmin =ar[i];
				 
			 }
		 }
		 System.out.println("first min value ===>" +fmin);
	}

}
