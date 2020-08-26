package by.htp.less03.main;

public class sixth {
	public static void main(String[] args) {
		
		int z = 7, x = 0 ; 
		int arr [] = new int [10];
		for (int q = 0 ; q < arr.length; q++) {
			arr[q] = (int) (Math.random() * 15);
		}
		for (int q = 0 ; q < arr.length; q++) {
			if (arr[q] > z) {
				arr[q] = z;
				x++;
			}
		}
		for ( int n : arr) {
			System.out.print(arr[n] + ", ");
			}
		System.out.println("The number of substitutions is: " + x);
	}

}
