import java.util.Scanner;

public class Task18 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter 2 numbers between 1 and 9: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		while(num1 < 1 || num1 > 9 || num2 < 1 || num2 > 9){
			System.out.println("Invalid input!");
			System.out.println("Please, enter 2 numbers between 1 and 9 again: ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
		}
		
		for(int i = 1; i <= num1; i++){
			for(int j = 1; j <= num2; j++){
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
		
	}
}
