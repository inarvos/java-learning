import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

	// private static final Path REPOSITORY_PATH = Paths.get("accounts.db");
	private static final Path REPOSITORY_PATH = Paths.get("account.db.txt");

	public static void main(String[] args) {

		// Repository repository = new BinarytRepository();
		Repository repository = new TextRepository();

		repository.load(REPOSITORY_PATH);

		System.out.println(repository);

		Scanner sc = new Scanner(System.in);

		System.out.println("Do you want to start the registration or login to the already registered account?(1/2): ");
		int answer = sc.nextInt();

		if (answer == 1) {

			System.out.println("Create a nickname: ");
			String newnickname = sc.next();

			// TODO: if exists than try again...
			if (repository.exists(newnickname.trim())) {
				throw new AccountException("Nick name already exists!");
			}

			System.out.println("Enter your age: ");
			int age = sc.nextInt();
			System.out.println("Enter your hometown: ");
			String hometown = sc.next();

			System.out.println("Enter your full name: ");
			String name = sc.next();

			System.out.println("Create a password: ");
			String password = sc.next();
			System.out.println("Your name: " + name + ", " + " Age: " + age + ", " + " Hometown: " + hometown + ", " + " Your nickname:"
					+ newnickname + ", "  + " Your password:" + password);
			System.out.println("Please check your data. If everything is correct, write Yes, if not - restart the registration.");
			String finishanswer = sc.next();
			if (finishanswer.equals("Yes")) {
				Account account = new Account(name, password, age, hometown, newnickname);

				repository.add(account);
				System.out.println("You have registered successfully.");
			} else {
				System.out.println("Try again.");
			}
			 
		} else if (answer == 2) {

			System.out.println("Enter your nickname: ");
			String nickname = sc.next();

			Account account = (Account) repository.findByNickname(nickname);

			if (account == null) {
				throw new AccountException("Account with nickname " + nickname + " doesn't exist");
			}

			System.out.println("Enter yor password: ");
			String password = sc.next();

			if (password.equals(account.getPassword())) {
				System.out.println("Your password is correct, welcome back.");
			} else if (password.equals("")){
				throw new AccountException("You have entered an empty password.");
			} else {
				System.out.println("Your password doesn's fit.");
			}

		} else {
			System.out.println("Sorry, but your answer doesn't fit.");
		}
		sc.close();

		repository.save(REPOSITORY_PATH);

	}

}
