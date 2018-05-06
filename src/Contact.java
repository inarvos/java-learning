import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Contact {

	private static final String DELIMITER = ";";
	private final String phoneNumber;
	private final String firstName;
	private final String lastName;

	public Contact(String otherPhoneNum, String otherFirstName, String otherLastName) {
		this.phoneNumber = otherPhoneNum;
		this.firstName = otherFirstName;
		this.lastName = otherLastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public static Contact of(String from, String delim) {
		String[] splitted = from.split(delim);
		return new Contact(splitted[0], splitted[1], splitted[2]);
	}

	public static String toString(Contact contact, String delim) {
		return String.join(delim, contact.getPhoneNumber(), contact.getFirstName(), contact.getLastName());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
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
		Contact other = (Contact) obj;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Contact [phoneNumber=" + phoneNumber + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public static void main(String[] args) throws IOException {

		/*
		 * 0. Read contacts.txt into Set<Contact> Creating a contact: 1.Class with
		 * fields: phone number, first name, last name; 1.1.add if not exists contact to
		 * the List<Contact> 2.Save contact information in text file; 2.1 Save
		 * List<Contact> in text file 3.Searching and printing the contact by a criteria
		 * (name/number);
		 */

		List<String> allContacts = Files.readAllLines(Paths.get("contacts.txt"));

		Set<Contact> contacts = new HashSet<Contact>();

		for (String aContact : allContacts) {
			contacts.add(Contact.of(aContact, DELIMITER));
		}

		System.out.println("Enter a contact information in a format : 0997775090; Vova; Hromyk");

		Scanner sc = new Scanner(System.in);

		String readLine = sc.nextLine();
		
		if (!readLine.isEmpty()) {
			Contact contact = Contact.of(readLine, DELIMITER);

			sc.close();

			System.out.println(contact);

			contacts.add(contact); // TODO: save contacts to the file....
			
			List<String> contatcsAsListOfString = new ArrayList<String>();

			for (Contact c : contacts) {
				contatcsAsListOfString.add(Contact.toString(c, DELIMITER));
			}

			Files.write(Paths.get("contacts.txt"), contatcsAsListOfString);
		}
		

		System.out.println("Enter the contact's name: ");

		Scanner scc = new Scanner(System.in);

		String name = scc.nextLine();

		scc.close();

		Contact foundContact = null;

		for (Contact c : contacts) {
			if (c.getFirstName().equalsIgnoreCase(name)) {
				foundContact = c;
			}
		}

		System.out.println(foundContact);

	}
}
