package homework6;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter 2 strings with a space between them: ");
		String str1 = sc.next();
		String str2 = sc.next();
		
		if(str1.length() == str2.length()){
			System.out.println("The strings are with equal length.");
		}
		else
		if(str1.length() > str2.length()){
			System.out.println("The first string is longer.");
		}
		else
		if(str1.length() < str2.length()){
			System.out.println("The second string is longer.");
		}
	
		System.out.println("The difference of positions: ");
		
		if(str1.length() >= str2.length()){
			for(int i = 0; i < str2.length(); i++){
				if(str1.charAt(i) != str2.charAt(i)){
					System.out.println((i+1) + " " + str1.charAt(i) + " - " + str2.charAt(i));
				}
			}		
		}
		else{
			for(int i = 0; i < str1.length(); i++){
				if(str1.charAt(i) != str2.charAt(i)){
					System.out.println((i+1) + " " + str1.charAt(i) + " - " + str2.charAt(i));
				}
			}	
		}
		
	}

}
