import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter A: ");
		int number1 = sc.nextInt();
		System.out.println("Please, enter B: ");
		int number2 = sc.nextInt();
		int sum = 0;
		int index = 0;
		
		if(number1 > number2){
			index = number1;
			number1 = number2;
			number2 = index;
		}
		
		for(int i = number1; i <= number2; i++){
			if(i % 3 == 0){
				System.out.print("skip " + i);
				if(i < number2){
					System.out.print(" , ");
				}
			}
			else{
				sum += i * i;
				if(sum > 200){
					System.out.print(i*i);
					break;
				}
				System.out.print(i*i);
				if(i < number2){
					System.out.print(" , ");
				}
			}	
		}

	}

}
