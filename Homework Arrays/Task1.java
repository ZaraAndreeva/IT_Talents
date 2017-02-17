package homework_arrays;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Please, enter the size of the array: ");
		int size = sc.nextInt();
		
		while(size < 1){
			System.out.println("The size can't be a negative number! ");
			System.out.println("Please, enter again: ");
			size = sc.nextInt();
		}
		
		int[] array = new int[size];
		
		System.out.println("Please, enter the elements of the array: ");
		for(int i = 0; i < array.length; i++){
			array[i] = sc.nextInt();
		}
		
		int min = array[0];
		
		for(int i = 0; i < array.length; i++){
			if(array[i] % 3 == 0){
				min = array[i];
				break;
			}
		}
		
		for(int i = 0; i < array.length; i++){
			if(array[i] % 3 != 0){
				continue;				
			}
			if(min > array[i]){
				min = array[i];
			}
		}
		
		if(min % 3 != 0){
			System.out.println("It doesn't exist an element that divides by 3.");
		}
		else{
			System.out.println("The smallest element that divides by 3 in the array is: " + min);
		}
	}

}
