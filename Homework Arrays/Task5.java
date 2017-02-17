package homework_arrays;

public class Task5 {

	public static void main(String[] args) {
		
		int[] array = new int[10];
		
		for(int i = 0; i < array.length; i++){
			array[i] = i * 3;
		}
		
		System.out.print("[");
		for(int i = 0; i < array.length; i++){
			if(i < array.length - 1){
				System.out.print(array[i] + ", ");
			}
			else{
				System.out.print(array[i]);
			}
		}
		System.out.println("]");

	}

}
