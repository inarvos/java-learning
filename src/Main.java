import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Check three digit's number. if it is even then find sum of number's digits else (if odd)
		 *  find multiply of all number's digits
		 */
		int number = 529; //526 -> "526" (int)'5' + (int)'2' + (int)'6'
	
				
		if (number % 2 == 0) {
			System.out.println(sumOfDigits(number));
		} else {
			System.out.println(productOfDigits(number));
		}
		
		
	}

	private static int productOfDigits(int number) {
		String stringOfNumber = String.valueOf(number).replace("-", "");
		int product = 1;
		for (int i = 0; i < stringOfNumber.length(); i++) {
			product = product * Integer.valueOf(stringOfNumber.substring(i, i + 1));
		}	
		return product;
	}

	private static int sumOfDigits(int number) {
		String stringOfNumber = String.valueOf(number).replace("-", "");
		int sum = 0;
		for (int i = 0; i < stringOfNumber.length(); i++) {
			sum = sum + Integer.valueOf(stringOfNumber.substring(i, i + 1));
		}	
		return sum;
	}

}
