package Assignment10october;

import java.util.LinkedHashSet;

public class PrintPositionOfEachNumberWithoutDuplicate {

	public static void main(String[] args) {
		int[] q = {4,3,2,3,1};
		
		LinkedHashSet <Integer> set = new LinkedHashSet<Integer>();
		for(int i=0;i<q.length;i++) {
			set.add(q[i]);
			
		}
		for(Integer ch: set) {
			for(int i=0;i<q.length;i++) {
				if(ch==q[i]) {
					System.out.println(ch+" "+(i+1));
					break;
					
				}
			}
		}
	}

}
