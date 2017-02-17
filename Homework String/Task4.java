package homework6;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter 2 strings of names with a comma between them: ");
		String string = sc.nextLine();
		
		String[] name = string.split(",");
		String firstName = name[0].trim();
		String secondName = name[1].trim();
		
		while(firstName.equals("") || secondName.equals("")){
			System.out.println("Invalid input! Please, enter again: ");
			string = sc.nextLine();
			name = string.split(",");
			firstName = name[0].trim();
			secondName = name[1].trim();
		}
		
		int firstSum = 0;
		int secondSum = 0;
		
		for(int i = 0; i < firstName.length(); i++){
			firstSum += firstName.charAt(i);
		}
		
		for(int i = 0 ; i < secondName.length(); i++){
			secondSum += secondName.charAt(i);
		}
		
		if(firstSum > secondSum){
			System.out.println(firstName);
		}
		else{
			System.out.println(secondName);
		}
		
	}	
	
}
