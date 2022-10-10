package practice;

import java.util.Scanner;

public class divBy3and5 {

	public static void main(String[] args) {
		for(;;) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		if(a%3==0 && a%5==0) {
			System.out.println("HiHello");
		}
		else if(a%3==0) {
			System.out.println("hi");
		}
		else if(a%5==0) {
			System.out.println("hello");
		}
		else {
			System.out.println("bye");
		}

	}

}
}