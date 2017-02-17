package homework_arrays;

import java.util.Scanner;

public class Task8 {

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
		
		int count = 1;
		int count_max = 1;
		int index = 0;
		
		for(int i = 0; i < arr.length - 1; i++){
			if(arr[i] == arr[i+1]){
				count++;
			}
			else{
				count = 1;
			}
			if(count > count_max){
				count_max = count;
				index = i + 1;
			}			
		}
		
		System.out.println("The longest row of equal elements is: ");
		for(int i = index; i > index - count_max; i--){
			System.out.print(arr[i] + " ");
		}
		
	}

}
