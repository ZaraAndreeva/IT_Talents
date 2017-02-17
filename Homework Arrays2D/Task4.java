package homework_array2d;

public class Task4 {

	public static void main(String[] args) {
		
		int[][] arr = { {1,2,3,4} , 
						{5,6,7,8} , 
						{9,10,11,12} , 
						{13,14,15,16} };
		int[][] arr_90 = new int[4][4];
		
		for(int row = 0; row < arr.length; row++){
			for(int col = 0; col < arr[0].length; col++){
				arr_90[row][col] = arr[arr.length - 1 - col][row];
			}
		}
		
		for(int row = 0; row < arr.length; row++){
			for(int col = 0; col < arr[0].length; col++){
				System.out.print(arr_90[row][col] + " ");
			}
			System.out.println();
		}

	}

}
