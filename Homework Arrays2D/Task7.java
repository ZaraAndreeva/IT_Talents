package homework_array2d;

public class Task7 {

	public static void main(String[] args) {
		
		int[][] arr = { {11,12,13,14,15,16} , 
						{21,22,23,24,25,26} , 
						{31,32,33,34,35,36} ,
						{41,42,43,44,45,46} ,
						{51,52,53,54,55,56} , 
						{61,62,63,64,65,66} 
						};
		int sumRows = 0;
		int sum = 0;
		
		/*
		for(int row = 0; row < arr.length; row++){
			for(int col = 0; col < arr[0].length; col++){
				if((row + col) % 2 == 0){
					System.out.print(arr[row][col] + " ");
					sumRows += arr[row][col];
					sum += arr[row][col];
				}
			}
			System.out.print(" - the sum is: " + sumRows);
			System.out.println();
			sumRows = 0;
		}
		System.out.println("The sum of all elements is: " + sum);
		*/
		
		int count = 0;

		for(int i = 0; i < arr.length; i++){
			if((count + i) % 2 == 0){
				sumRows += arr[count][i];
				System.out.print(arr[count][i] + " ");
			}
			if (i == arr.length - 1){
				count++;
				if(count != 6){
					System.out.println(" - sum is: " + sumRows);
					sum += sumRows;
					sumRows = 0;
					i = -1;
				}
				else{
					System.out.println(" - sum is: " + sumRows);
					sum += sumRows;
					System.out.print("The sum of all is: " + sum);
				}
			}
		}
		
	}

}
