package homework_arrays;

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter the size of the array: ");
		int size = sc.nextInt();
		
		while(size < 1){
			System.out.println("The size must be a natural number!");
			System.out.println("Enter the size again: ");
			size = sc.nextInt();
		}
		
		double[] arr = new double[size];
		System.out.println("Please, enter the elements of the array: ");
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextDouble();
		}
		
		//without using Math.abs
		double[] arr_copy = new double[arr.length];
		
		
		for(int i = 0; i < arr.length ; i++){
			if(arr[i] < 0){
				arr_copy[i] = -(arr[i]);
			}
			else{
				arr_copy[i] = arr[i];
			}
		}
		
		double max = arr_copy[0];
		int index_max = 0;
		for(int i = 0; i < arr.length; i++){
			if(max < arr_copy[i]){
				max = arr_copy[i];
				index_max = i;
			}
		}
		
		double max1 = arr_copy[0];
		int index_max1 = 0;
		for(int i = 0; i < arr.length; i++){
			if(max1 < arr_copy[i] && max != arr_copy[i]){
				max1 = arr_copy[i];
				index_max1 = i;
			}
		}
		
		double max2 = arr_copy[0];
		int index_max2 = 0;
		for(int i = 0; i < arr.length; i++){
			if(max2 < arr_copy[i] && max1 != arr_copy[i] && max != arr_copy[i]){
				max2 = arr_copy[i];
				index_max2 = i;
			}
		}
		
		System.out.println("The 3 elements which absolut value is the biggest:");
		System.out.println(arr[index_max] + " " + arr[index_max1] + " " + arr[index_max2]);
		
		/*
		//using Math.abs
		double maxElement1 = arr[0];
		for(int i = 0; i < arr.length; i++){
			if(maxElement1 < Math.abs(arr[i])){
				maxElement1 = arr[i];
			}
		}
		
		double maxElement2 = arr[0];
		for(int i = 0; i < arr.length; i++){
			if(maxElement2 < Math.abs(arr[i]) && maxElement1 != arr[i]){
				maxElement2 = arr[i];
			}
		}
		
		double maxElement3 = arr[0];
		for(int i = 0; i < arr.length; i++){
			if(maxElement3 < Math.abs(arr[i]) && maxElement1 != arr[i] && maxElement2 != arr[i]){
				maxElement3 = arr[i];
			}
		}
		
		System.out.println("The three elements which absolut value is the biggest are: ");
		System.out.print(maxElement1 + " " + maxElement2 + " " + maxElement3);
		*/
		
	}
}
