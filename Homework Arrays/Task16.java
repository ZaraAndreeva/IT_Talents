package homework_arrays;

import java.text.DecimalFormat;

public class Task16 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#.##");

		double[] arr = {-1.12, -2.43, 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4};
		double[] arr_copy = new double[arr.length];
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < -0.231){
				arr_copy[i] = (i + 1) * (i + 1) + 41.25;
			}
			else{
				arr_copy[i] = arr[i] * (i + 1);
			}
		}
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < arr_copy.length; i++){
			System.out.print(df.format(arr_copy[i]) + " ");
		}

	}

}
