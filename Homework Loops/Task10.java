import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter a number: ");
		int number = sc.nextInt();
		boolean isItPrime = true;
		
		while(number < 1){
			System.out.println("Invalid number!");
			System.out.println("Please, enter a number again: ");
			number = sc.nextInt();
		}
		
		for(int i = 2; i < number; i++){
			if(number % i == 0){
				isItPrime = false;
			}
		}
		
		if(isItPrime){
			System.out.println("The number is prime.");
		}
		else{
			System.out.println("The number is NOT prime.");
		}
		
	}

}
