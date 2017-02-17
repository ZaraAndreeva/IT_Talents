
public class Task12 {

	public static void main(String[] args) {
		
		for(int i = 100; i <= 987; i++){
			
			int digit1 = i / 100;
			int digit2 = i / 10 % 10;
			int digit3 = i % 10;
		
			if(digit1 != digit2 && digit2 != digit3 && digit1 != digit3){
				System.out.println(i);
			}
			
		}

	}
}
