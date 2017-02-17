package homework_arrays;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter a number: ");
		int number = sc.nextInt();
		int[] array = new int[10];
		
		array[0] = number;
		array[1] = number;
		 
		for(int i = 2; i < array.length; i++){
				array[i] = array[i - 1] + array[i - 2];
		}
		
		System.out.print("[");
		for(int i = 0; i < array.length; i++){
			if(i < array.length - 1){
				System.out.print(array[i] + ", ");
			}
			else{
				System.out.print(array[i]);
			}
		}
		System.out.println("]");
		 

	}

}
