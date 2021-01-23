package variable;

import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] abc = {'A', 'B', 'C', 'D'};
		char[] number = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		char[] result = new char[abc.length + number.length];

		System.out.println(abc);
		System.out.println(number);
		
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(number, 0, result, abc.length, number.length);
		System.out.println(result);
		
		System.arraycopy(abc, 0, number, 0, abc.length);
		System.out.println(number);
		
		System.arraycopy(abc, 0, number, 6, 3);
		System.out.println(number);
	}

}
