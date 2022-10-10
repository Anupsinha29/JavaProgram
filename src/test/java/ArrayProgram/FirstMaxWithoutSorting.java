package ArrayProgram;

public class FirstMaxWithoutSorting {

	public static void main(String[] args) {
		int[] arr = {1,2,54,98,6,86,4};
		int fmax= arr[0];
		int smax =arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=fmax) {
			
				if(arr[i]!=fmax) {
					smax=fmax;
					
				}
				fmax=arr[i];
					 
					
					
				}
				else if(fmax==smax || arr[i]>smax) {
					smax =arr[i];
					
				}
				
			}
		System.out.println("First max value ==> " +fmax);
		System.out.println("Second max value ==>" +smax);
		}

}

	
