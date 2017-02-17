import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter a number between 1 and 52: ");
		int number = sc.nextInt();
		
		while(number < 1 || number > 52){
			System.out.println("Invalid number! ");
			System.out.println("Please, enter a number between 1 and 52 again: ");
			number = sc.nextInt();
		}
		
		for(int i = number; i <= 52; i++){
			
			switch((i - 1) / 4){
			case 0:
				System.out.print("2 ");
				break;
			case 1:
				System.out.print("3 ");
				break;
			case 2:
				System.out.print("4 "); 
				break;
			case 3:
				System.out.print("5 ");
				break;
			case 4:
				System.out.print("6 ");
				break;
			case 5:
				System.out.print("7 ");
				break;
			case 6: 
				System.out.print("8 "); 
				break;
			case 7:
				System.out.print("9 ");
				break;
			case 8:
				System.out.print("10 ");
				break;
			case 9:
				System.out.print("Jack ");
				break;
			case 10:
				System.out.print("Queen "); 
				break;
			case 11:
				System.out.print("King ");
				break;
			case 12:
				System.out.print("Ace ");
				break;
			}
			
			switch(i % 4){
			case 0:
				System.out.println("spade"); //pika
				break;
			case 1:
				System.out.println("club"); //spatiya
				break;
			case 2:
				System.out.println("diamond"); //karo
				break;
			case 3:
				System.out.println("heart"); //kupa
				break;
			}	
		}

	}

}
