package homework_arrays;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[7];
		System.out.println("Please, enter 7 elements: ");
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		int index = 0;
		index = arr[0];
		arr[0] = arr[1];
		arr[1] = index;
		
		arr[2] = arr[2] + arr[3];
		arr[3] = arr[2] - arr[3];
		arr[2] = arr[2] - arr[3];
		
		arr[4] = arr[4] * arr[5];
		arr[5] = arr[4] / arr[5];
		arr[4] = arr[4] / arr[5];
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}

	}

}
