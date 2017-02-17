package homework6;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a string: ");
		String str = sc.nextLine();
		
		String[] words = str.split(" ");
		
		for(int i = 0; i < words.length; i++){
			System.out.print(words[i].substring(0, 1).toUpperCase());
			for(int j = 1; j < words[i].length(); j++){
				System.out.print(words[i].substring(j, j + 1).toLowerCase());
			}
			if (i <= words.length) {
				System.out.print(" ");
			}
		}
		
	}

}
