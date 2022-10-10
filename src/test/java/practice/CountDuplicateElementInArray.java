package practice;

import java.util.Arrays;

public class CountDuplicateElementInArray {

	public static void main(String[] args) {
		int arr[] = {6,1,2,1,6,8,7,8,7,8,9,9,9,9};
		countDuplicate(arr);

	}
	static void countDuplicate(int arr[]) {
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-1;i++) {
			int count =1;
			for(int j=i+1;j<arr.length;j++) {
		if(arr[i]==arr[j]) 
			count++;
		else
			break;
		
		}
			if(count>1) {
				System.out.println(arr[i]+" ->  "+count);
				i+=(count-1);
			}
		
	}
	}
}
