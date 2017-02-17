package homework_array2d;

public class Task1 {

	public static void main(String[] args) {
		
		int[][] arr2d = { {48,72,13,14,15} , 
						  {21,22,53,24,75} ,
						  {31,57,33,34,35} , 
						  {41,95,43,44,45} , 
						  {59,52,53,54,55} , 
						  {61,69,63,64,65} 
						  };
		
		int min = arr2d[0][0];
		int max = arr2d[0][0];
		
		for(int row = 0; row < arr2d.length; row++){
			for(int col = 0; col < arr2d[0].length; col++){
				if(min > arr2d[row][col]){
					min = arr2d[row][col];
				}
				if(max < arr2d[row][col]){
					max = arr2d[row][col];
				}
			}
		}
		
		System.out.println("The min is: " + min);
		System.out.println("The max is: " + max);
		
	}

}
