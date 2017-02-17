import java.util.Scanner;
public class Task14 {

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Please, enter a number between 10 and 200: ");
		int num = sc.nextInt();
		
		while(num < 10 || num > 200){
			System.out.println("Invalid number!");
			System.out.println("Please, enter a number between 10 and 200 again: ");
			num = sc.nextInt();
		}

		System.out.println("The numbers divisible by 7 and smaller than your number are: ");
		
		for(int i = num; i >= 10; i--){
			if(i % 7 == 0){
					System.out.println(i);
				}	
		}
		
		
	}
}
