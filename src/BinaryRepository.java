import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Repository {
	
	private final List<Account> repos;
	
	public Repository(List<Account> repos) {
		this.repos = repos;
	}
	
	public List<Account> getRepository() {
		return repos;
	}

	public static Repository from(String fileName) {
		
		List<Account> repository = new ArrayList<>();
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
			repository = (List<Account>) ois.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Repository repos = new Repository(repository);
		
		return repos;
		
	}
	

	public static void saveRepository(String fileName, Repository repos) {
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
			
			oos.writeObject(repos.getRepository());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

	
	public void add(Account account) {
		
		if (!exists(account.getNickname())) {
			repos.add(account);
		}
	}

	public boolean exists(String nickname) {
		
		if (nickname.isEmpty()) return false;
		
		boolean exists = false;
		
		for (Account account : repos) {
			if (nickname.equals(account.getNickname())){
				exists = true;
				break;
			}
				
		}
		
		return exists;
	}
	

	


}
