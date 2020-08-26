package by.htp.less03.main;
public class forth {
	public static void main(String[] args) {
	int array1 [] = {1,3,6,5,7,9,1};
	int array2 [] = array1;
	int t = -1;
	for (int q = 0 ; q < array1.length; q ++) {
		if (array1[q] % 2 ==0 ) {
			t++;
			array2[t] = array1[q];	
			System.out.println(array2[t]);
		}
	}
	
	if (t == -1) {
		System.out.println("None");
	}
	
	}
}
