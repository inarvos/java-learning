import java.io.IOException;
import java.nio.file.Paths;

public class TextRepositoryCreator {
	
	public static void main(String[] args) throws IOException {
		
		Account account = new Account("Vova", "000000", 19, "Chernivtsy", "ing");
		
		Account account2 = new Account("Dima", "111111", 46, "Toprivtsy", "dimkas71");
		
		Repository repository = new TextRepository();
		
		repository.add(account);
		repository.add(account2);
		
		repository.save(Paths.get("account.db.txt"));
		
		
		
	}

}
