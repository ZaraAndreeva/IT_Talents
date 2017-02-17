import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter a number between 10 and 99: ");
		int num = sc.nextInt();
		
		while(num < 10 || num > 99){
			System.out.println("Invalid number!");
			System.out.println("Please, enter a number between 10 and 99 again: ");
			num = sc.nextInt();
		}
		
		do{
			if(num % 2 == 0){
				System.out.print(num / 2 + " ");
				num = num / 2;
			}
			else{
				System.out.print(3 * num + 1 + " ");
				num = num * 3 + 1;
			}
		}
		while(num > 1);

	}

}
