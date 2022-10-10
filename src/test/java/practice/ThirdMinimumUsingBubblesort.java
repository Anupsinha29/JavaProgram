package practice;

import java.util.Scanner;

public class ThirdMinimumUsingBubblesort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int a = sc.nextInt();
		int [] n = new int[a];
		for(int i=0;i<n.length;i++) {
			n[i] =sc.nextInt();
			
		}
		for(int i=0;i<n.length;i++) {
			System.out.println(n[i]);
		}
		
		System.out.println("array without before sorting"); 
		System.out.println();
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n.length;j++) {
				if(n[i]<n[j]) {
					int temp = n[i];
					n[i] = n[j];
					n[j]= temp;
					
				}
			}
		}
		System.out.println("Elements after sorting");
		for(int i=0;i<n.length;i++) {
		System.out.print(n[i]);
		
		
	}
		System.out.println();
		System.out.println(n[n.length-3]);
}
}
