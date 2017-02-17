package homework_arrays;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[7];
		System.out.println("Please, enter 7 elements: ");
		for(int i = 0; i < array.length; i++){
			array[i] = sc.nextInt();
		}
		
		int br = 0;
		for(int i = 0; i < array.length; i++){
			if(array[i] % 5 == 0 && array[i] > 5){
					System.out.print(array[i] + " ");
					br++;
			}
		}
		System.out.println(" - " + br + " numbers");
	}

}
