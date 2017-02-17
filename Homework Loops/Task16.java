import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter a number between 10 and 5555: ");
		int num1 = sc.nextInt();
		System.out.println("Please,enter a number between 10 and 5555: ");
		int num2 = sc.nextInt();
		int index = 0;
		
		if(num1 > num2){
			index = num1;
			num1 = num2;
			num2 = index;
		}
		
		while(num1 < 10 || num1 > 5555 || num2 < 10 || num2 > 5555){
			System.out.println("Invalid number!");
			System.out.println("Please, enter two numbers between 10 and 5555 again: ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
		}
		
		if(num1 < 50 && num2 < 50){
			System.out.println("There are no numbers divisible by 50.");
		}
		
		for(int i = num2; i >= num1; i--){
			if(i % 50 == 0){
				System.out.println(i);
			}
		}		

	}
}
