package homework_arrays;

import java.util.Scanner;

public class Task4 {

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
		int min = array[0];
		
		System.out.println("Please, enter the elements of the array: ");
		for(int i = 0; i < array.length; i++){
			array[i] = sc.nextInt();
		}
		
		int[] array_copy = new int[array.length];
		
		for(int i = 0, j = array.length - 1; i < array.length && j >= 0; i++, j--){
			array_copy[i] = array[j];
		}
		
		boolean areArraysEqual = true;
		
		for(int i = 0; i < array.length; i++){
			if(array[i] != array_copy[i]){
				areArraysEqual = false;
			}
		}
		
		System.out.println(areArraysEqual ? "The array is like a mirror." : "The array is NOT like a mirror.");
		
	}

}
