
public class Task20 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++){
			int counter = 0;
			for(int j = i; j < 10; j++){
				System.out.print(j + " ");
				counter++;
			}
			if(counter < 10){
				for(int k = 0; counter < 10 ; k++){
					System.out.print(k + " ");
					counter++;
				}
			}
			System.out.println();
		}

	}

}
