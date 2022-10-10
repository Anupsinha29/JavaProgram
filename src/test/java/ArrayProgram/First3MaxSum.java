package ArrayProgram;

public class First3MaxSum {

	public static void main(String[] args) {
		int[] arr = {8,3,4,32,86,4,5};
		//first maximum element  ---> last index value
		//first minimum element ----> first index value
		
			
			for(int i=0;i<arr.length;i++) {
				for(int j=i;j<arr.length;j++) {
					if(arr[i]<arr[j]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						
						
					}
				}
			}
			
			int sum=0;
			for(int i=0;i<3;i++) {
				sum = sum+arr[i];
				
			}
			System.out.println(sum);

	}

}
