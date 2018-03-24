import java.util.Scanner;
public class ReportCard {
   public static char convertGrades(int grade) {
	   if (grade > 90) {
		   return 'A';
	   } else if (grade >= 80 && grade <= 90) {
		   return 'B';
	   } else if (grade >= 70 && grade < 80) {
		   return 'C';
	   } else if (grade >= 0 && grade < 70) {
		   return 'D';
	   } else {
		   return Character.MIN_VALUE;
	   }
   } 
   
   public static void main(String[] args) {
	   System.out.println(ReportCard.convertGrades(88));
	   System.out.println(ReportCard.convertGrades(55));
	   Scanner sc = new Scanner(System.in);
	   int grade = sc.nextInt();
	   sc.close();
	   switch (ReportCard.convertGrades(grade)) {
			case 'A':
				System.out.println("Excellent job!");
				break;
			case 'B':
				System.out.println("Good job!");
				break;
			case 'C':
				System.out.println("Need to work more!");
				break;
			case 'D':
				System.out.println("Change your attitude!");
				break;
			default:
				System.out.println("We have some problems here...");
				break;

		}
	   
	   //System.out.println((int)Character.valueOf('A'));
   }
   
}
