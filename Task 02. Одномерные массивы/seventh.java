package by.htp.less03.main;

public class seventh {

	public static void main(String[] args) {
		int arr[] = { 9 , 6 , 7 , 4 , 12 , 5 , 7 , 15 , 6 , 11 };//10
		int max = arr[0];
		int min = arr [0];
		int minPos =  0, maxPos = 0;
		
		
		
		for (int x = 0 ; x < arr.length ; x++ ){
			
			if (arr[x] < min ) {
			min = arr[x];
			minPos = x;
			}
			if (arr[x] > max ) {
				max = arr[x];
				maxPos = x;
				}
			}	
		
		arr[minPos] = max;
		arr[maxPos] = min;
		
		for( int d = 0 ; d < arr.length ; d++) {
			System.out.print(arr[d] + ", ");
		}
		System.out.println("-----" + min+ "-----" + max);
	}
}
