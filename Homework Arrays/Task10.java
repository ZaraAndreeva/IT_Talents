package homework_arrays;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[7];
		System.out.println("Please, enter 7 elements: ");
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		double sum = 0;
		for(int i = 0; i < arr.length; i++){
			sum = sum + arr[i];
		}
		double average = sum / arr.length;
		
		System.out.println("The average number is: " + average);
		
		double[] arr_copy = new double[arr.length];
		
		for(int i = 0; i < arr.length; i++){
			arr_copy[i] = Math.abs(average - arr[i]);
			
		}
		
		double min = arr_copy[0];
		int index = 0;
		
		for(int i = 0; i < arr.length; i++){
			if(min > arr_copy[i]){
				min = arr_copy[i];
				index = i;
			}
		}
		
		System.out.println("The closest number to the average number is: " + arr[index]);
		
	}

}
