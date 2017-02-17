import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter a number: ");
		int number = sc.nextInt();
		int sum = 1;
		
		if(number >= 0){
			for(int i = 2; i <= number; i++){
				sum += i;
			}
		}
		else{
			for(int i = number; i <= -1; i++){
				sum += i;
			}
		}
		
		System.out.println("The sum of all numbers from 1 to the number is: " + sum);

	}

}
