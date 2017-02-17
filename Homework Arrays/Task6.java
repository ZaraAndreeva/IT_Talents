package homework_arrays;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter the size of the first array: ");
		int size1 = sc.nextInt();
		
		while(size1 < 1){
			System.out.println("The size can't be a negative number! ");
			System.out.println("Please, enter again: ");
			size1 = sc.nextInt();
		}
		
		int[] arr1 = new int[size1];
		
		System.out.println("Please, enter the elements of the first array: ");
		for(int i = 0; i < arr1.length; i++){
			arr1[i] = sc.nextInt();
		}
		
		System.out.println();
		
		System.out.println("Please, enter the size of the second array: ");
		int size2 = sc.nextInt();
		
		while(size2 < 1){
			System.out.println("The size can't be a negative number! ");
			System.out.println("Please, enter again: ");
			size2 = sc.nextInt();
		}
		
		int[] arr2 = new int[size2];
		
		System.out.println("Please, enter the elements of the second array: ");
		for(int i = 0; i < arr2.length; i++){
			arr2[i] = sc.nextInt();
		}
		
		boolean areArraysEqual = true;
		
		if(arr1.length != arr2.length){
			areArraysEqual = false;
		}
		else{
			for(int i = 0; i < arr1.length; i++){
				if(arr1[i] != arr2[i]){
					areArraysEqual = false;
				}
			}
		}
		
		System.out.println(areArraysEqual ? "The arrays are equal." : "The arrays are NOT equal.");

	}

}
