import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a natural number: ");
		int num = sc.nextInt();
		
		int var = num - 1;
		
		while(num < 1){
			System.out.println("Invalid number! ");
			System.out.println("Enter a number again: ");
			num = sc.nextInt();
		}
		
		for(int i = 1; i <= num; i++){
			for(int j = 1; j <= num; j++){
				System.out.print(var);
			}
			var += 2;
			System.out.println();
		}
		
	}

}
