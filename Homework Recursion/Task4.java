package homework7;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter the begin number: ");
		int num1 = sc.nextInt();
		System.out.println("Please, enter the end number: ");
		int num2 = sc.nextInt();
		
		System.out.println(triangleSymbols(num1,num2));
		
		sc.close();
	}
	
	static String row(int n) 
    {
        if (n == 1)
            return "1";

        return row(n - 1) + " " + n;
    }

    static String triangleSymbols(int a, int b)
    {
        if (a == b)
            return row(b);
        
        return row(a) + "\n" + triangleSymbols(a + 1, b);

    }

}
