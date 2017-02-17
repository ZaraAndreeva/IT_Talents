import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter a number between 2 and 27: ");
		int sum = sc.nextInt();
		
		while(sum < 2 || sum > 27){
			System.out.println("Invalid number");
			System.out.println("Please, enter a number between 2 and 27 again: ");
			sum = sc.nextInt();
		}
	
		for(int i = 100; i <= 999; i++){
			int digit1 = i / 100;
			int digit2 = i / 10 % 10;
			int digit3 = i % 10;
			if(digit1 + digit2 + digit3 == sum){
					System.out.print(i + ";");
			}
		}

	}

}
