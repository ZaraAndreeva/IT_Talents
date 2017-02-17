package homework_arrays;

public class Task18 {

	public static void main(String[] args) {
		
		int[] arr1 = {18,19,32,1,3, 4, 5, 6, 7, 8};
		int[] arr2 = {1, 2, 3,4,5,16,17,18,27,11};
		int[] arr_copy = new int[arr1.length];
		
		for(int i = 0; i < arr1.length; i++){
			if(arr1[i] < arr2[i]){
				arr_copy[i] = arr2[i];
			}
			if(arr1[i] > arr2[i]){
				arr_copy[i] = arr1[i];
			}
			if(arr1[i] == arr2[i]){
				arr_copy[i] = arr1[i];
			}
		}
		
		for(int i = 0; i < arr1.length; i++){
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < arr2.length; i++){
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		System.out.println();
		for(int i = 0; i < arr1.length; i++){
			System.out.print(arr_copy[i] + " ");
		}
		
		
	}

}
