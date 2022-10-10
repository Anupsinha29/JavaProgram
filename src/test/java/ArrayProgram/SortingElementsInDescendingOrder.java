package ArrayProgram;

public class SortingElementsInDescendingOrder {

	public static void main(String[] args) {
		int ar[] = {2,6,8,12,16};
		int temp;
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					temp =ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}for(int i=0;i<ar.length;i++) {
			
		
		System.out.println(ar[i]);
		}
		
	}

}
