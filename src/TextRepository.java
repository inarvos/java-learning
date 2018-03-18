import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TextRepository implements Repository<Account>, Serializable {
	
	private static final long serialVersionUID = -7644247602558215844L;
	
	private Set<Account> repos;
	
	public TextRepository() {
		repos = new HashSet<>();
	}
	

	@Override
	public void load(Path p) {
		
		try {
			List<String> lines = Files.readAllLines(p);
			
			Set<Account> targetRepos = new HashSet<>();
			
			
			for (String line : lines) {
				Account acc = new Account();
				String[] fields = line.split(";");
				
				acc.setNickname(fields[0].trim());
				acc.setPassword(fields[1].trim());
				acc.setAge(Integer.valueOf(fields[2].trim()));
				acc.setUsername(fields[3].trim());
				acc.setHomeTown(fields[4].trim());
				
				targetRepos.add(acc);
			}
		
			repos = new HashSet<>(targetRepos);
			
		} catch (IOException e) {
			throw new AccountException("File not found " + e.getMessage());
		}
		
	}

	@Override
	public void save(Path p) {
		
		List<String> content = new ArrayList<>();
		
		for (Account account : repos) {
			String s = account.getNickname() + ";" +
						account.getPassword() + ";" +
						account.getAge() + ";" +
						account.getUsername() + ";" +
						account.getHomeTown();
					
			content.add(s);
		}
		
		StringBuilder sb = new StringBuilder();
		
		int index = 0;
		for (String currentLine : content) {
			sb.append(currentLine);
			if (index++ != content.size() - 1) {
				sb.append("\n");
			}
		}
		
		try {
			Files.write(p, sb.toString().getBytes());
		} catch (IOException e) {
			throw new AccountException(e.getMessage());
		}
	
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
		return "TextRepository [repos=" + repos + "]";
	}
	
	

}
