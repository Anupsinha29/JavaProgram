package practice;

import java.util.Scanner;



public class sortarray {

	public static void main(String[] args) 
		
	 {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int a = sc.nextInt();
		int ar[] = new int[a];
		for(int i=0;i<ar.length;i++) {
			ar[i]= sc.nextInt();
			
		}
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar.length;j++) {
				if(ar[i]<ar[j]) {
					int temp = ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
					
				}
			}
		}
		System.out.println();
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		System.out.println();
		//array length starts with 1
		System.out.println(ar[ar.length-2]);
		
		
	}

	}

