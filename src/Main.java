import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//TODO: initialize repos for saving accounts
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to start the registration or login to the already registered account?(1/2): ");
		int answer = sc.nextInt();
		if (answer == 1){
			System.out.println("Enter your full name: ");
			String name = sc.next();
			System.out.println("Enter your age: ");
			int age = sc.nextInt();
				if (age < 18){
					System.out.println("Sorry, but only adults can registrate here.");
				} else if (age > 110) {
					System.out.println("Please enter your real age." + age + " is impossibly big.");
				}
				else {
					System.out.println("Enter your hometown: ");
					String hometown = sc.next();
					System.out.println("Create a nickname: ");
					String newnickname = sc.next();
					System.out.println("Create a password: ");
					String password = sc.next();
					System.out.println("Please check your data. If everything is correct, enter Yes. But if you want to change something, restart the registration.");
					System.out.println("Your name: " + name + " Age: " + age + " Hometown: " + hometown + " Your nickname:" + newnickname + " Your password:" + password);
					String checking = sc.next();
					if (checking.equalsIgnoreCase("Yes")){
						System.out.println("You have registered successfully.");
						System.out.println(". - - -  .  |.        |       ..       |");
						System.out.println("|           |  .      |     .    .     |");
						System.out.println("|- -     |  |    .    |    .------.    |");
						System.out.println("|        |  |      .  |   .        .   |");
						System.out.println("|        |  |        .|  .          .  |-------");
					}
				}
		} else if (answer == 2){
			System.out.println("Enter your nickname: ");
			String nickname = sc.next();
			if (nickname.equals("Vova")){
				System.out.println("Enter yor password: ");
				String password = sc.next();
				if (password.equals("vova")){
					System.out.println("Your password is correct, welcome back.");
				} else {
					System.out.println("Your password doesn's fit.");
				}
			} else if (nickname.equals("Dima")){
				System.out.println("Enter your passwod: ");
				String password = sc.next();
				if (password.equals("1111")){
					System.out.println("Your password is correct, welcome back.");
				} else {
					System.out.println("Your password doesn't fit.");
				}
			} else {
				System.out.println("This nickname is not registered yet");
			}
			
		} else {
			System.out.println("Sorry, but your answer doesn't fit.");
			System.out.println(".----|  .----.  .----.  .----.  .      . ");
			System.out.println("|       |    |  |    .  |    .    .   . ");
			System.out.println(".----.  |    |  |.--    |.--        .");
			System.out.println("     |  |    |  |  .    |  .       .");
			System.out.println("|----.  .----.  |   .   |   .     .");
		}
		sc.close();

		
		//TODO: save accounts to the disk...
		
	}


}
