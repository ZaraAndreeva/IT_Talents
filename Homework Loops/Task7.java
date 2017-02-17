import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter a number: ");
		int n = sc.nextInt();
		int number = 3;
		
		while(n <= 0){
			System.out.println("Invalid number!");
			System.out.println("Please, enter a number again: ");
			n = sc.nextInt();
		}
		
		System.out.println("The first " + n + " numbers devided by 3 are: ");
		
		for(int i = 1; i <= n; i++){
			System.out.print(number);
			if(i < n)
				System.out.print(",");
			number+=3;
		}
	
	}
}
