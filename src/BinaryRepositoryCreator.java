import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryRepositoryCreator {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		Account account = new Account("Vova", "000000", 19, "Chernivtsy", "ing");
		
		Account account2 = new Account("Dima", "111111", 46, "Toprivtsy", "dimkas71");
		
		BinaryRepository repository = new BinaryRepository();
		
		repository.add(account);
		repository.add(account2);
		
		
		//TODO: encode passwords for Example with help java.util.Base64 class
		//TODO: test
			
		
		
		File file = new File("accounts.db");
		
		
		ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(file));
		
		writer.writeObject(repository);
		
		writer.close();		
		
		/*BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		
		writer.write("������");
		
		writer.close();
		
		BufferedReader reader = new BufferedReader(new FileReader(file));
		
		String info = reader.readLine();
		
		reader.close();
		
		
		System.out.println(info);
		*/
		
		ObjectInputStream reader = new ObjectInputStream(new FileInputStream(file));
		
		BinaryRepository repos = (BinaryRepository) reader.readObject();
		
		reader.close();
		
		System.out.println(repos);
		//System.out.println(readAcount);
	}

}
