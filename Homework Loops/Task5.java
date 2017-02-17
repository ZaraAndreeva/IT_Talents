import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter the first number: ");
		int number1 = sc.nextInt();
		System.out.println("Please, enter the second number: ");
		int number2 = sc.nextInt();
		int index = 0;
		
		if(number1 > number2){
			index = number1;
			number1 = number2;
			number2 = index;
		}
		
		for(int i = number1; i <= number2; i++){
			System.out.println(i);
		}
	
	}
}
