import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int a = 3, b = 4;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int entered = sc.nextInt();
		
		
		if (entered < a) {
			System.out.println("The smallest");
		} else if ((entered >= a) && (entered <= b)) {
            System.out.println("Between");
		} else {
			System.out.println("The largest");
		}
		
		
		sc.close();
	}

}
