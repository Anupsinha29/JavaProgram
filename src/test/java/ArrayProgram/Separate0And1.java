package ArrayProgram;

public class Separate0And1 {

	public static void main(String[] args) {
		int[] ar = {0,1,1,1,0,1,0};
		int[] temp = new int [ar.length];
		int m=0;
		int n = ar.length-1;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==0) {
			temp[m]=1;
			m++;
			
		}
		else  {
			temp[n]=0;
			n--;
			
		}
		}
	
	for(int i=0;i<temp.length;i++) {
		System.out.print(temp[i]+" ");
		
	}
	

	}
}


