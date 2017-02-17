import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Please enter a number between 10 and 30000: ");
		int number = sc.nextInt();
		
		int new_number = 0;
		int number1 = number;
		
		while(number < 30 || number > 30000){
			System.out.println("Invalid number!");
			System.out.println("Please enter a number between 10 and 30000 again: ");
			number = sc.nextInt();
		}

		do{
			int ost = number1 % 10;
			new_number = new_number * 10 + ost;
			number1 /= 10;
		}
		while(number1 > 0);
		
		if(number == new_number){
			System.out.println("The number is a palindrome.");
		}
		else{
			System.out.println("The number is not a palidrome.");
		}

	}

}
