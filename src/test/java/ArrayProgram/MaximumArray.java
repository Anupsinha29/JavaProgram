package ArrayProgram;

public class MaximumArray {

	public static void main(String[] args) {
		int[] arr = {8,3,4,32,2,4,5};
		//first maximum element  ---> last index value
		//first minimum element ----> first index value
		
			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					if(arr[i]<arr[j]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						
						
					}
				}
			}
			
			System.out.println("First Maximum Element ---->" +arr[arr.length-1]);
			System.out.println("First Minimum Element --->" +arr[arr[0]]);
			
		
		
		
			}

}
