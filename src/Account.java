import java.io.Serializable;

public class Account implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6484081194708751252L;
	
	private String username;
	private String password;
	private int age;
	private String homeTown;
	private String nickname;
	
	public Account() {}

	public Account(String username, String password, int age, String homeTown, String nickname) {
		super();
		setUsername(username);
		setPassword(password);
		setAge(age);
		setHomeTown(homeTown);
		setNickname(nickname);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		
		if ("".equals(username)) {
			throw new AccountException("username shoul'nt be empty");
		}
		
		char firstSymbol = username.charAt(0);
		if (Character.isDigit(firstSymbol)) {
			throw new AccountException("The first symbol should not begin with a digit");
		}
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (password.length() < 6) {
			throw new AccountException("Password to short it should be greater than 5 symbols");
		}
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		
		if (age < 0) {
			throw new AccountException("Not born yet");
		}
		
		if (age < 18) {
			throw new AccountException("too young guy!!!");
		}
		this.age = age;
	}

	public String getHomeTown() {
		return homeTown;
	}

	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		if (nickname.equals("")) {
			throw new AccountException("Nickname should not be empty");
		}
		this.nickname = nickname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((homeTown == null) ? 0 : homeTown.hashCode());
		result = prime * result + ((nickname == null) ? 0 : nickname.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (age != other.age)
			return false;
		if (homeTown == null) {
			if (other.homeTown != null)
				return false;
		} else if (!homeTown.equals(other.homeTown))
			return false;
		if (nickname == null) {
			if (other.nickname != null)
				return false;
		} else if (!nickname.equals(other.nickname))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [username=" + username + ", password=" + password + ", age=" + age + ", homeTown=" + homeTown
				+ ", nickname=" + nickname + "]";
	}
	
	
	
	
	

}
