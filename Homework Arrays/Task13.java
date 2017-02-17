package homework_arrays;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter a number: ");
		int num = sc.nextInt();
		
		while(num < 0){
			System.out.println("The number must be a positive number!");
			System.out.println("Please, enter again: ");
			num = sc.nextInt();
		}
		
		int num_copy = num;
		int size = 0;
		
		while(num_copy != 0){
			num_copy /= 2;
			size++;
		}
		
		if(size == 0){
			size = 1;
		}
		
		int[] arr = new int[size];
		
		for(int i = arr.length - 1; i >= 0; i--){
			int size1 = num % 2;
			arr[i] = size1;
			num /= 2;
		}
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]);
		}

	}

}
