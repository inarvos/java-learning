import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class BinaryRepository implements Repository<Account>, Serializable {
		
	private static final long serialVersionUID = 7687646013230107098L;
	
	private List<Account> repos;
	
	public BinaryRepository() {
		repos = new ArrayList<>();
	}
	
	@Override
	public void add(Account account) {
		
		if (!exists(account.getNickname())) {
			repos.add(account);
		}
	}

	@Override
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

	@Override
	public Account findByNickname(String nickname) {
		
		if ("".equals(nickname)) return null;
		
		Account found = null;
		
		for (Account account : repos) {
			if (nickname.equals(account.getNickname())) {
				found = account;
				break;
			}
		}
		
		return found;
		
	}
	
	@Override
	public String toString() {
		return "Repository [repos=" + repos + "]";
	}

	@Override
	public void load(Path p) {
		
		
		BinaryRepository r = null;
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(p.toFile()))) {
			r = (BinaryRepository) ois.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		repos = new ArrayList<Account>(r.repos);
		
	}

	@Override
	public void save(Path p) {
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(p.toFile()))) {
			
			oos.writeObject(this);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
