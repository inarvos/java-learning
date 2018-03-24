
public class ReportCard {
   public static char convertGrades(int grade) {
	   if (grade > 90) {
		   return 'A';
	   } else if (grade >= 80 && grade <= 90) {
		   return 'B';
	   } else if (grade >= 70 && grade < 80) {
		   return 'C';
	   } else {
		   return 'D';
	   }
   }
   public static void main(String[] args) {
	   System.out.println(ReportCard.convertGrades(88));
	   System.out.println(ReportCard.convertGrades(55));
   }
}
