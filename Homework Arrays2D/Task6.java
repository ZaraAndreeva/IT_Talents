package homework_array2d;

public class Task6 {

	public static void main(String[] args) {
		
		int[][] arr = { {11,12,13,14,15,16} , 
						{21,22,23,24,25,26} ,
						{31,32,33,34,35,36} ,
						{41,42,43,44,45,46} , 
						{51,52,53,54,55,56} , 
						{61,62,63,64,65,66} 
						};
		int sumRow = 0;
		int sumOfAll = 0;
		
		for(int row = 1; row < arr.length; row+=2){
			for(int col = 0; col < arr[0].length; col++){
				System.out.print(arr[row][col] + " ");
				sumRow += arr[row][col];
				sumOfAll += arr[row][col];
			}
			System.out.println("- sum is: " + sumRow);
			sumRow = 0;
		}
		
		System.out.println("The sum of all elements is: " + sumOfAll);
		

	}

}
