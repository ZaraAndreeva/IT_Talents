package homework_arrays;

import java.util.Scanner;

public class Task7 {

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
		arr2[0] = arr1[0];
		arr2[arr1.length - 1] = arr1[arr1.length - 1];
		
		for(int i = 1; i < arr1.length - 1; i++){
			arr2[i] = arr1[i - 1] + arr1[i + 1];
		}
		
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

	}

}
