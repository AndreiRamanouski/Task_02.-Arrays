package by.htp.less03.main;

public class fifth {
	public static void main(String[] args) {
		int arr [] = new int[5];
		
		int min = arr[0];
		int max = arr[0];
		
		for ( int r = 0 ; r < arr.length ; r++ ) {
			arr[r] = (int) (Math.random() * 500);
		}
		for (int r = 0 ; r < arr.length ; r++ ) {
			if (arr[r] < min ) {
				min = arr[r];
				}
			if (arr[r] > max ) {
				max = arr[r];
				}
		}
		System.out.println("Длинна числовой оси: " + (max - min));
		
	}

}
