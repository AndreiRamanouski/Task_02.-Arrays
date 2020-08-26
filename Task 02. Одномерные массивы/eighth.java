package by.htp.less03.main;

public class eighth {
public static void main(String[] args) {
		int arr [] = new int[20];
		int i = 20;
		
		for ( int r = 0 ; r < arr.length ; r++ ) {
			arr[r] = (int) (Math.random() * 40);
			
			if ( arr[r] > i ) {
				System.out.println("Число :" + arr[r] + " в слоте: " + r );
			}
			
		}
		 
	}
}
