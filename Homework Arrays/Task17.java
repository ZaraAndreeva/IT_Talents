package homework_arrays;

import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter the size of the array: ");
		int size = sc.nextInt();
		
		while(size < 1){
			System.out.println("The size can't be a negative number! ");
			System.out.println("Please, enter again: ");
			size = sc.nextInt();
		}
		
		int[] arr = new int[size];
		System.out.println("Please, enter the elements of the array: ");
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		boolean isItTrue = true;
		
		for(int i = 0; i < arr.length - 1; i++){
			if(i % 2 == 0){
				if(arr[i] > arr[i + 1]){
					isItTrue = false;
					break;
				}
			}
			else{
				if(arr[i] < arr[i + 1]){
					isItTrue = false;
					break;
				}
			}
		}
		
		System.out.println(isItTrue ? "The row satisfies the requirements." : "The row does NOT satisfy the requirements.");

	}

}
