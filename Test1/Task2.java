
public class Task2 {

	public static void main(String[] args) {
		
		String text1 = "Today the weather is very nice";
		String text2 = "Yesterday the weather was not nice";
		String text3 = "Next week the weather will be nice";
		
		stringTask(text1, text2, text3);

	}
	
	static void stringTask(String text1, String text2, String text3){
		
		String[] str1 = text1.split(" ");
		String[] str2 = text2.split(" ");
		String[] str3 = text3.split(" ");
		
		String[] strHelp = new String[5];
		int index = 0;
		int counter = 0;
		
		for(int i1 = 0; i1 < str1.length; i1++){
			for(int i2 = 0; i2 < str2.length; i2++){
				for(int i3 = 0; i3 < str3.length; i3++){
					if(str1[i1].equals(str2[i2]) && str1[i1].equals(str3[i3])){
						strHelp[index] = str1[i1];
						index++;
						counter++;
					}
				}
			}
		}
		
		int maxIndex = 0;
		int max = strHelp[0].length();
		for(int i = 0; i < counter; i ++){
			if( max < strHelp[i].length() ){
				max = strHelp[i].length();
				maxIndex = i;
			}
		}
		
		System.out.print("All equal words are: ");
		for(int i = 0; i < counter; i++){
			System.out.print(strHelp[i] + " ");
		}
		System.out.println();
		System.out.println("Number of equal words is: " + counter);
		System.out.println("the longest word: " + strHelp[maxIndex]);
		
	}

}
