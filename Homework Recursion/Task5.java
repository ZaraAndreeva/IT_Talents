package homework7;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Please, enter a number: ");
	    int n = sc.nextInt();
	    
	    int n_copy = n;
	    int rev = 0;
	    int remainder = 0;
	    while (n_copy != 0) {
            remainder = n_copy % 10;
            rev = rev * 10 + remainder;
            n_copy = n_copy / 10;
        }
	    
	    System.out.print(rev + " - ");
	    
	    if(isPalindrome(n)){
	    	System.out.println("the number is palindrome");
	    }
	    else{
	    	System.out.println("the number is not a palindrome");
	    }
	    
	    sc.close();  

	}
	
	static boolean isPalindrome(int number) {
        int number_copy = number; 
        int rev = 0;

        while (number_copy != 0) {
            int remainder = number_copy % 10;
            rev = rev * 10 + remainder;
            number_copy = number_copy / 10;
        }

        if (number == rev) {
            return true;
        }
        else{
        	return false;
        }
        
    }

	
}
