package practice;

import java.util.HashSet;

public class RemoveDuplicateinArrayElement {

	public static void main(String[] args) {
		int[] a = {5,5,5,3,5,2,4,9,9};
		HashSet <Integer> hs = new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			hs.add(a[i]);
			
		}
		for(int no:hs) {
			System.out.println(no+" ");
		}

	}

}
