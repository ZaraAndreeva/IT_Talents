package homework_arrays;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter the size of the array: ");
		int size = sc.nextInt();
		
		while(size < 1){
			System.out.println("The size can't be a negative number! ");
			System.out.println("Please, enter again: ");
			size = sc.nextInt();
		}
		
		int[] arr1 = new int[size];
		System.out.println("Please, enter the elements of the array: ");
		for(int i = 0; i < arr1.length; i++){
			arr1[i] = sc.nextInt();
		}
		
		int[] arr2 = new int[arr1.length];
		
		for(int i = 0, j = arr1.length - 1; i < arr1.length && j >= 0; i++, j--){
			arr2[i] = arr1[j];
		}
		
		System.out.println("With another array:");
		System.out.print("[");
		for(int i = 0; i < arr1.length; i++){
			if(i < arr1.length - 1){
				System.out.print(arr2[i] + ", ");
			}
			else{
				System.out.print(arr2[i]);
			}
		}
		System.out.println("]");
		
		//2 nachin bez drug masiv
		
		for(int i = 0, j = arr1.length - 1; i < arr1.length / 2 && j >= 0; i++, j--){
			arr1[i] = arr1[i] + arr1[j];
			arr1[j] = arr1[i] - arr1[j];
			arr1[i] = arr1[i] - arr1[j];
		}
		
		System.out.println("Without another array: ");
		System.out.print("[");
		for(int i = 0; i < arr1.length; i++){
			if(i < arr1.length - 1){
				System.out.print(arr1[i] + ", ");
			}
			else{
				System.out.print(arr1[i]);
			}
		}
		System.out.println("]");

	}

}
