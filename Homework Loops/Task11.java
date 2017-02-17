import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter a number: ");
		int num = sc.nextInt();
		int spaces = num - 1;
		int stars = 1;
		
		while(num < 1){
			System.out.println("Invalid number!");
			System.out.println("Please, enter a number again: ");
			num = sc.nextInt();
		}

		for(int i = 1; i <= num; i++){
			for(int j = 1; j <= spaces; j++){
				System.out.print(" ");
			}
			for(int s = 1; s <= stars; s++){
				System.out.print("*");
			}
			spaces--;
			stars+=2;
			System.out.println();
		}

	}

}
