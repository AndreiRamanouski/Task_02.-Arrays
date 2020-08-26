package by.htp.less03.main;

public class third {
	public static void main(String[] args) {
		
		int array [] = {1,2,3,4,5,6,7,8,9,10};
		int counter = 0;
		
		for (int r = 0 ; r < array.length ; r++ ) {
			if (counter < array[r]) {
				System.out.println("works");
			}
			else { 
				System.out.println("Broken");
			break;
			}
			counter = array[r];
		}
	}

}
