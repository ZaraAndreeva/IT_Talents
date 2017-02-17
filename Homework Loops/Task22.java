import java.util.Scanner;

public class Task22 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter a number between 1 and 999: ");
		int num = sc.nextInt();
		int counter = 0;
		
		while(num < 1 || num > 999){
			System.out.println("Invalid number!");
			System.out.println("Please, enter a number between 1 and 999 again: ");
			num = sc.nextInt();
		}
	
		while(counter < 10){
			if((num % 2 == 0) || (num % 3 == 0) || (num % 5 == 0)){
				counter++;
				
				if(counter < 10){
					System.out.print(counter + ":" + num + " , ");
				}
				else{
					System.out.print(counter + ":" + num);
				}
				
			}
			num++;
		}
		
	}
}
