package homework7;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter two numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		while(num1 < 2 || num2 < 2){
			System.out.println("The numbers must be bigger than 2, enter again: ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
		}
		
		System.out.println("The product is: " + multNumbers(num1,num2));
		
		sc.close();
	}
	
	static int multNumbers(int a, int b){
		if(b == 0){
			return 0;
		}
		if(b == 1){
			return a;
		}
		
		return a + multNumbers(a, b-1);
		
	}

}
