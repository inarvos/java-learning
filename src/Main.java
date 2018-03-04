import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Если хотите сравнить вес на Земле с весом на других планетах СС, введите 1 , с весом на Луне - 2, с весом на Солнце - 3: ");
		int i = sc.nextInt();

		if ((i == 1) || (i == 2) || (i == 3)) {
			System.out.print("Вес на Земле(кг.): ");
			double weightOnTheEarth = sc.nextInt();
			if (i == 1) {
				System.out.println("Заданный вес на Плутоне равен: " + weightOnTheEarth * 0.064 + " кг.");
				System.out.println("Заданный вес на Меркурие равен: " + weightOnTheEarth * 0.378 + " кг.");
				System.out.println("Заданный вес на Венере равен: " + weightOnTheEarth * 0.905 + " кг.");
				System.out.println("Заданный вес на Марсе равен: " + weightOnTheEarth * 0.378 + " кг.");
				System.out.println("Заданный вес на Юпитере равен: " + weightOnTheEarth * 2.302 + " кг.");
				System.out.println("Заданный вес на Сатурне равен: " + weightOnTheEarth * 0.895 + " кг.");
				System.out.println("Заданный вес на Уране равен: " + weightOnTheEarth * 0.905 + " кг.");
				System.out.println("Заданный вес на Нептуне равен: " + weightOnTheEarth * 1.137 + " кг.");
			}
			if (i == 2) {
				System.out.println("Заданный вес на Луне равен: " + weightOnTheEarth * 0.17);
			}
			if (i == 3) {
				System.out.println("Заданный вес на Солнце равен: " + weightOnTheEarth * 27.072);
			}
		} else {
			System.out.println("Вы ввели неподходящее число!");
		}
		
		sc.close();

	}

}
