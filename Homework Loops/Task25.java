import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter a positive number: ");
		int num = sc.nextInt();
		int var = 1;
		
		while(num < 0){
			System.out.println("The number is not positive!");
			System.out.println("Please, enter a number again: ");
			num = sc.nextInt();
		}
	
		System.out.print(num + "! is: ");
		
		if(num == 0){
			var = 1;
		}
		else{
			do{
				var *= num;
				num--;
			}
			while(num > 0);
		}
		
		System.out.print(var);
	
	}

}
