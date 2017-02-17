package homework_array2d;

public class Task5 {

	public static void main(String[] args) {
		
		int[][] arr = { {1,2,3,4} , 
						{5,6,7,8} , 
						{9,10,11,12} ,
						{13,14,15,16} 
						};
		
		int[] arr_maxRow = new int[arr.length]; //ednom masiv, v koito shte zapazvam vsichki sumi po redove
		int sumRow = 0; // sumite za vseki red na dvum masiv
		int maxSumRow = arr_maxRow[0];
		
		for(int row = 0; row < arr.length; row++){
			for(int col = 0; col < arr[0].length; col++){
				sumRow += arr[row][col];
			}
			arr_maxRow[row] = sumRow;
			sumRow = 0;
		}	
		
		for(int i = 0; i < arr.length; i++){
			if(maxSumRow < arr_maxRow[i]){
				maxSumRow = arr_maxRow[i];
			}
		}
		System.out.println("The max sum rows is: " + maxSumRow);
		
		
		int[] arr_maxCol = new int[arr[0].length];
		int sumCol = 0;
		int maxSumCol = 0;
		
		for(int col = 0; col < arr[0].length; col++){
			for(int row = 0; row < arr.length; row++){
				sumCol += arr[row][col];
			}
			arr_maxCol[col] = sumCol;
			sumCol = 0;
		}
		
		for(int i = 0; i < arr[0].length; i++){
			if(maxSumCol < arr_maxCol[i]){
				maxSumCol = arr_maxCol[i];
			}
		}
		System.out.println("The max sum cols is: " + maxSumCol);
		
		if(maxSumRow > maxSumCol){
			System.out.println("Max sum rows is > than max sum cols.");
		}
		else{
			System.out.println("Max sum cols is > than max sum rows.");
		}
		
	}

}
