package homework6;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a string: ");
		String str = sc.nextLine();
		
		String[] words = str.split(" ");
		
		int sum = 0;
		int maxSum = words[0].length();
		
		
		for(int i = 0; i < words.length; i++){
			sum = words[i].length();
			if(maxSum < sum){
				maxSum = sum;
			}
		}
		
		System.out.print(words.length + " words , the longest word is: " + maxSum);
		
		

	}

}
