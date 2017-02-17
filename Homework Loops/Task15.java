import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter a number: ");
		int number = sc.nextInt();
		int sum = 0;
		
		if(number >= 0){
			do{
				sum += number;
				number--;
			}
			while(number > 0);
		}
		else{
			do{
				sum += number;
				number++;
			}
			while(number < 2);
		}
		
		System.out.println("The sum from 1 to your number is: " + sum);
		
	}

}
