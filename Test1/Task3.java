
public class Task3 {

	public static void main(String[] args) {
		
		int[] arr = {1,5,3,7};
		int x = 3;
		
		System.out.println(product(arr,x,1,arr.length-1));

	}
	
	static int product(int[] arr, int x, int product, int i){
		
		if(product == 1 && i == 0){
			return -1;
		}
		
		if(i == 0){
			return product;
		}
		
		if(arr[i] % 2 != 0 && arr[i] > x){
			product *= arr[i];
		}
		return product(arr,x,product,--i);
		
	}

}
