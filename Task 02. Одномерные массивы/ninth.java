package by.htp.less03.main;

public class ninth {
public static void main(String[] args) {
		int positive = 0 , negative = 0 , zero = 0 ;
		int arr [] = { 9 , -3 , 0 , 0 , 3 , -9 , -4 , 2 , 0 , 0 }; //10
		
		for ( int y = 0 ; y < arr.length ; y++ ) {
			if ( arr[y] > 0 ) {
				positive ++ ; 
			}
			else if ( arr[y] < 0 ) {
				negative ++ ;
			}
			else { 
				zero ++;
				}
		}
		System.out.println("Positive: " + positive );
		System.out.println("Negative: " + negative );
		System.out.println("Zero: " + zero );
	}
}
