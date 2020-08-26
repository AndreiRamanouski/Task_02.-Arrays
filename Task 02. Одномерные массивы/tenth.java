package by.htp.less03.main;

public class tenth {
	public static void main(String[] args) {
		int n = 3;
		int arr [] = new int [2*n];
		int smth = 0;
		int max = 0;
		int x = 0;
		int t = arr.length - 1 ;
		for ( int i = 0 ; i < arr.length ; i ++ ) {
			arr[i] = (int) (Math.random() * 10);
			System.out.println(arr[i]);
		}
		
		for ( int i = 0 ; i <= n  ; i ++ ) {
				smth = arr[x] + arr[t];
				x++; t--;
				if ( smth > max ) {
					max = smth;
					
					}
			
			
		}
		System.out.print(" Max: " + max);
		
		
		
	}
}
