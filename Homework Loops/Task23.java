
public class Task23 {

	public static void main(String[] args) {
		
		int num1 = 1;
		int count = 1;
		
		while(num1 < 10){
			System.out.print(num1 + " row: ");
			int num2 = 1;
			while(num2 < 10){
				if((num2 == 1 && num1 > 1) || 
					(num2==2 && num1 > 2) ||
					(num2==3 && num1 > 3) || 
					(num2==4 && num1 > 4) || 
					(num2==5 && num1 > 5) || 
					(num2==6 && num1 > 6) || 
					(num2==7 && num1 > 7) || 
					(num2==8 && num1 > 8)){
					num2++;
					continue;
				}
				else{
					System.out.print(num1 + " * " + num2 + "; ");
				}
				num2++;
			}
			System.out.println();
			num1++;
		}
		
	}

}
