import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("������� ������ 141 �����.");
	System.out.println("������ ����� ������� (1/2) : ");
	int group = sc.nextInt();
	if(group == 1 || group == 2) {
		System.out.println("������ ����� ����� (1/2) : ");
		int week = sc.nextInt();
		if(week == 1 || week == 2) {
			System.out.println("������ ���� �����: ");
			String day = sc.next();
			if(day.equalsIgnoreCase("��������")){
				System.out.println("1. ���� ����������, 9-3, ���� �.�.");
				System.out.println("2. ������������� �� �������������, 8-117, ��������� �.�.");
				if(group == 1) 
					if(week == 1){
						System.out.println("3. ������������� �� �������������, 8-213, ��������� �.�.");
				//if(group == 1 && week == 1) {System.out.println("3. ������������� �� �������������, 8-213, ��������� �.�.");}
				}
				if(group == 2)
					if(week == 2) {
						System.out.println("3. ������������� �� �������������, 8-213, ��������� �.�.");
				//if(group == 2 && week == 2) {System.out.println("3. ������������� �� �������������, 8-213, ��������� �.�.");}		
					}
				System.out.println("4. Գ����� ��������� (�� �������)");
			}
			if(day.equalsIgnoreCase("³������")) {
				System.out.println("1. ������� ����� �� ������� ������������ (�� �������)");
				if(week == 1) {
					System.out.println("3. ��������� ����������, 8-212, ������� �.�.");
				}
				if(week == 2) {
					System.out.println("3. ����'������ �������, 8-212, ��������� �.�.");
				}
				if(group == 1)
					if(week == 1) {
						System.out.println("4. ����'������ �������, 8-213, ��������� �.�.");
					}
				//if(group == 1 && week == 1){System.out.println("4. ����'������ �������, 8-213, ��������� �.�.");}		
				if(group == 2)
					if(week == 1) {
						System.out.println("4. ��������� ����������, 8-212, ������� �.�.");
					}
				//if(group == 2 && week == 1) {System.out.println("4. ��������� ����������, 8-212, ������� �.�.");}
				if(group == 1)
					if(week == 2) {
						System.out.println("4. ��������� ����������, 8-212, Գ����� �.�.");
					}
				//if(group == 1 && week == 2) {System.out.println("4. ��������� ����������, 8-212, Գ����� �.�.");}
				if(group == 2)
					if(week == 2) {
						System.out.println("4. ����'������ �������, 8-213, ��������� �.�.");
					}
				//if(group == 2 && week == 2) {System.out.println("4. ����'������ �������, 8-213, ��������� �.�.");}
			}
			if(day.equalsIgnoreCase("������")) {
				System.out.println("1. ���-�������㳿 �� ���-������, 8-221, ������� �.�.");
				if(group == 1) {
					System.out.println("2. ���� ����������, 8-212, ��������� �.�.");
				}
				if(group == 2) {
					System.out.println("2. ���� ����������, 8-211, Գ����� �.�.");
				}
				System.out.println("3. ���� ����������, 9-3, ���� �.�.");
				if(group == 2)
					if(week == 1) {
						System.out.println("4. ����'������ �������, 8-213, ��������� �.�.");
					}
				//if(group == 2 && week == 1) {System.out.println("4. ����'������ �������, 8-213, ��������� �.�.");}
				if(group == 1)
					if(week == 2) {
						System.out.println("4. ����'������ �������, 8-213, ��������� �.�.");
					}
				//if(group == 1 && week == 2) {System.out.println("4. ����'������ �������, 8-213, ��������� �.�.");}
			}
			if(day.equalsIgnoreCase("������")) {
				System.out.println("1. �������� ����, 8-202, ������� �.�.");
				if(group == 1)
					if(week == 1) {
						System.out.println("2. ����� ���������, 8-213, �������� �.�.");
					}
				//if(group == 1 && week == 1) {System.out.println("2. ����� ���������, 8-213, �������� �.�.");}
				if(group == 2)
					if(week == 1) {
						System.out.println("2. ���-�������㳿 �� ���-������, 8-216, ��������� �.�.");
					}
				//if(group == 2 && week == 1) {System.out.println("2. ���-�������㳿 �� ���-������, 8-216, ��������� �.�.");}
				if(group == 1)
					if(week == 2) {
						System.out.println("2. ���-�������㳿 �� ���-������, 8-216, ��������� �.�.");
					}
				//if(group == 1 && week == 2) {System.out.println("2. ���-�������㳿 �� ���-������, 8-216, ��������� �.�.");}
				if(group == 2)
					if(week == 2) {
						System.out.println("2. ����� ���������, 8-213, �������� �.�.");
					}
				//if(group == 1 && week == 1) {System.out.println("2. ����� ���������, 8-213, �������� �.�.");}
				if(group == 1)
					if(week == 1) {
						System.out.println("3. ���-�������㳿 �� ���-������, 8-216, ��������� �.�.");
					}
				//if(group == 1 && week == 1) {System.out.println("3. ���-�������㳿 �� ���-������, 8-216, ��������� �.�.");}
				if(group == 2)
					if(week == 2) {
						System.out.println("3. ���-�������㳿 �� ���-������, 8-216, ��������� �.�.");
					}
				//if(group == 2 && week == 2) {System.out.println("3. ���-�������㳿 �� ���-������, 8-216, ��������� �.�.");}
				System.out.println("4. �������� ���� (���������), 8-202, ������� �.�.");
			}
			if(day.equalsIgnoreCase("�'������") || day.equalsIgnoreCase("�������")) {
				System.out.println("1. ����� ���������, 8-106, �������� �.�.");
				if(group == 1) {
					System.out.println("2. ���� ����������, 8-212, ��������� �.�.");
				}
				if(group == 2) {
					System.out.println("2. ���� ����������, 8-211, Գ����� �.�.");
				}
			}
				else if(day.equalsIgnoreCase("������") && day.equalsIgnoreCase("�����")) {
					System.out.println("�������� ����.");
			}
				else {
					System.out.println("���� �������� �����������.");
				}
		} else {
			System.out.println("������ ������ ����� �� ����.");
		}
		
	} else {
		System.out.println("���� ������� �� ����.");
	}
	sc.close();
	}

}