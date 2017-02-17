package homework_array2d;

public class Task3 {

	public static void main(String[] args) {
		
		int[][] arr = { {1,2,3,4} ,
						{5,6,7,8} , 
						{9,10,11,12} ,
						{13,14,15,16}
						};
		double sum = 0;
		
		for(int row = 0; row < arr.length; row++){
			for(int col = 0; col < arr.length; col++){
				sum += arr[row][col];
			}
		}
		
		double average = sum / (arr.length * arr[0].length);
		
		System.out.println("The sum is: " + sum);
		System.out.println("The average is: " + average);

	}

}
