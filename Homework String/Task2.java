package homework6;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter 2 strings with space between them: ");
		String str1 = sc.next();
		String str2 = sc.next();
		
		while(str1.length() < 7 || str1.length() > 20 || str2.length() < 7 || str2.length() > 20){
			System.out.println("The size must be between 10 and 20, enter again: ");
			str1 = sc.next();
			str2 = sc.next();
		}
		
		String str1_5 = str1.replace(str1.substring(0,5),str2.substring(0,5));
		String str2_5 = str2.replace(str2.substring(0,5), str1.substring(0,5));
		
		if(str1_5.length() > str2_5.length()){
			System.out.println(str1_5.length() + " " + str1_5);
		}
		else{
			System.out.println(str2_5.length() +  " " + str2_5);
		}
		
		

	}

}
