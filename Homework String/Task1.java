package homework6;

import java.util.Scanner;

public class Task1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter the first string: ");
		String str1 = sc.nextLine();
		System.out.println("Please, enter the second string: ");
		String str2 = sc.nextLine();
		
		while(str1.length() >= 40 || str2.length() >= 40){
			System.out.println("Invalid input! It must be less that 40 symbols.");
			str1 = sc.nextLine();
			str2 = sc.nextLine();
		}
		
		System.out.println("The first string: ");
		System.out.print(str1.toUpperCase() + " ; " + str1.toLowerCase());
		System.out.println();
		System.out.println("The second string: ");
		System.out.println(str2.toUpperCase() + " ; " + str2.toLowerCase());
		
	}

}
