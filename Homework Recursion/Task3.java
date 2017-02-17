package homework7;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter a number: ");
		int n = sc.nextInt();
		
		if(isPrime(n, n/2)){
			System.out.println("The number is prime.");
		}
		else{
			System.out.println("The number is not prime.");
		}
		
		sc.close();

	}
	
	static boolean isPrime(int n, int div) {
		if (div == 1){
			return true;
		}
		
		if (n % div == 0){
			return false;
		}
		else{
			return isPrime(n, div - 1);
		}
	}

}
