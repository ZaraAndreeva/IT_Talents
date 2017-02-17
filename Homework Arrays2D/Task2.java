package homework_array2d;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter n: ");
		int n = sc.nextInt();
		
		while (n < 1){
			System.out.println("The number must be a positive number!");
			System.out.println("Please, enter again: ");
			n = sc.nextInt();
		}
		
		int[][] arr2d = new int[n][n];
		
		for(int row = 0; row < arr2d.length; row++){
			for(int col = 0; col < arr2d.length; col++){
				System.out.println("[" + row + "][" + col + "]");
				arr2d[row][col] = sc.nextInt();
			}
		}
		System.out.println("The matrix is: ");
		for(int row = 0; row < arr2d.length; row++){
			for(int col = 0; col < arr2d.length; col++){
				System.out.print(arr2d[row][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("The main diagonal: ");
		for(int row = 0; row < arr2d.length; row++){
			for(int col = 0; col < arr2d.length; col++){
				if( row == col ){
					System.out.print(arr2d[row][col] + " ");
				}
			}
		}
		
		System.out.println();
		System.out.println("The secondary diagonal: ");
		for(int row = 0; row < arr2d.length; row++){
			for(int col = 0; col < arr2d.length; col++){
				if( row + col == arr2d.length - 1){
					System.out.print(arr2d[row][col] + " ");
				}
			}
		}

	}

}
