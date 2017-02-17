package homework6;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a string: ");
		String str = sc.nextLine();
		String strPalindrome = "";
		
		for(int i = str.length()-1; i >= 0; i--){
			strPalindrome = strPalindrome + str.charAt(i);
		}
		
		if(str.equals(strPalindrome)){
			System.out.println("It is a palindrome.");
		}
		else{
			System.out.println("It is NOT a palindrome.");
		}
		
	}

}
