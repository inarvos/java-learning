import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"���� ������ �������� ��� �� ����� � ����� �� ������ �������� ��, ������� 1 , � ����� �� ���� - 2, � ����� �� ������ - 3: ");
		int i = sc.nextInt();

		if ((i == 1) || (i == 2) || (i == 3)) {
			System.out.print("��� �� �����(��.): ");
			double weightOnTheEarth = sc.nextInt();
			if (i == 1) {
				System.out.println("�������� ��� �� ������� �����: " + weightOnTheEarth * 0.064 + " ��.");
				System.out.println("�������� ��� �� �������� �����: " + weightOnTheEarth * 0.378 + " ��.");
				System.out.println("�������� ��� �� ������ �����: " + weightOnTheEarth * 0.905 + " ��.");
				System.out.println("�������� ��� �� ����� �����: " + weightOnTheEarth * 0.378 + " ��.");
				System.out.println("�������� ��� �� ������� �����: " + weightOnTheEarth * 2.302 + " ��.");
				System.out.println("�������� ��� �� ������� �����: " + weightOnTheEarth * 0.895 + " ��.");
				System.out.println("�������� ��� �� ����� �����: " + weightOnTheEarth * 0.905 + " ��.");
				System.out.println("�������� ��� �� ������� �����: " + weightOnTheEarth * 1.137 + " ��.");
			}
			if (i == 2) {
				System.out.println("�������� ��� �� ���� �����: " + weightOnTheEarth * 0.17);
			}
			if (i == 3) {
				System.out.println("�������� ��� �� ������ �����: " + weightOnTheEarth * 27.072);
			}
		} else {
			System.out.println("�� ����� ������������ �����!");
		}
		
		sc.close();

	}

}
