package homework6;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter a string: ");
		String str = sc.next();
		
		for(int i = 0; i < str.length(); i++){
			char newLetter = (char)(str.charAt(i)+5);
			System.out.print(newLetter);
		}

	}

}
