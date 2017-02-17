import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int counter = 0;
		int counterPairs = 0;
		
		while(true){
			
			String card1 = sc.next();
			String card2 = sc.next();
			
			counter++;
			
			boolean isValid1 = false;
			boolean isValid2 = false;
			
			switch(card1){
			
			case("2"):
			case("3"):
			case("4"):
			case("5"):
			case("6"):
			case("7"):
			case("8"):
			case("9"):
			case("T"):
			case("J"):
			case("Q"):
			case("K"):
			case("A"):
				isValid1 = true;
			}
			
			switch(card2){
			
			case("2"):
			case("3"):
			case("4"):
			case("5"):
			case("6"):
			case("7"):
			case("8"):
			case("9"):
			case("T"):
			case("J"):
			case("Q"):
			case("K"):
			case("A"):
				isValid2 = true;
			}
			
			if(!isValid1 || !isValid2){
				counter--;
				counterPairs = 0;
				System.out.println("Invalid card!");
				continue;
			}

			if( ( card1.equals("A") && ( card2.equals("T") || card2.equals("J") || card2.equals("Q") || card2.equals("K") || card2.equals("A") ) ) 
				|| ( card2.equals("A") && ( card1.equals("T") || card1.equals("J") || card1.equals("Q") || card1.equals("K") || card1.equals("A") ) ) ){
				counterPairs++;
			}
			else{
				counterPairs = 0;
			}
			
			if(counterPairs == 5){
				System.out.println("Number of tries: " + counter);
				break;
			}
			
			
		}
		
		sc.close();
		
	}

}
