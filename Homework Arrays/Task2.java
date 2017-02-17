package homework_arrays;

public class Task2 {

	public static void main(String[] args) {
		
		int[] array = {2,6,3,12,-4,7,0,9,-5,1};
		int[] arr_copy = new int[array.length];
		
		for(int i = 0; i < array.length / 2; i++){
				arr_copy[i] = array[i];
		}
		
		for(int i = array.length - 1, j = array.length / 2; i >= array.length / 2 && j < array.length; i--, j++){
			arr_copy[j] = array[i];
		}
		
		System.out.print("[");
		for(int i = 0; i < array.length; i++){
			if(i < array.length - 1){
				System.out.print(arr_copy[i] + ", ");
			}
			else{
				System.out.print(arr_copy[i]);
			}
		}
		System.out.println("]");
		
	}

}
