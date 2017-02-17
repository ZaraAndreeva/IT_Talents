package homework7;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter a number: ");
		int n = sc.nextInt();
		System.out.println("The number is: " + fibonacci(n));
		
		sc.close();
	}
	
	static int fibonacci(int n){
		if(n == 1){
			return 1;
		}
		if(n == 2){
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}

}
