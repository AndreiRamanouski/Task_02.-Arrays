package by.htp.less03.main;

public class First {
 public static void main(String[] args) {
	 
	 int array [] = new int [5];
	 int k = 2, e = 0;
	 
	 for(int q = 0 ; q < array.length ; q++ ) {
		 array [q] = (int) (Math.random() * 25);
		 if (array[q] % k == 0 ) {
			 e += array[q];
		 }
		 
	 } 
	 System.out.println(e);
 }
}
