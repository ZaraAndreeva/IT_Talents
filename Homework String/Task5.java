package homework6;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter two words: ");
		String str1 = sc.nextLine();
		
		String[] words = str1.split(" ");
		
		int index1 = -1;
		int index2 = -1;
		
		for(int i = 0; i < words[0].length(); i++){
			for(int j = 0; j <words[1].length(); j++){
				if(words[0].charAt(i) == words[1].charAt(j)){
					index1 = i;
					index2 = j;
					break;
				}
			}
			if(index1 > -1){
				break;
			}
		}
		
		if(index1 > -1){
			for(int i = 0; i < words[0].length(); i++){
				if(i == index1){
					System.out.println(words[1]);
				}
				else{
					for(int j = 0; j < index2; j++){
						System.out.print(" ");
					}
					System.out.println(words[0].charAt(i));
				}
			}
		}
		else{
			System.out.println("There are no equal symbols.");
		}
		

	}

}
