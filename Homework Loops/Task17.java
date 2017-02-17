import java.util.Scanner; 

public class Task17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter side of the square between 3 and 20: ");
		int side = sc.nextInt();
		
		while(side < 3 || side > 20){
			System.out.println("Invalid number!");
			System.out.println("Please, enter side of the square between 3 and 20 again: ");
			side = sc.nextInt();
		}
		
		System.out.println("Please enter a symbol: ");
		char symbol = sc.next().charAt(0);
		
		for(int i = 1; i <= side; i++){	
			if(i > 1 && i < side){
				System.out.print("*");
				for(int j = 1; j <= side-2; j++){
					System.out.print(symbol);
				}
				System.out.print("*");
			}
			else{
				for(int k = 1; k <= side; k++){
					System.out.print("*");
				}
			}
			System.out.println();
		}
			
		
		
	}

}
