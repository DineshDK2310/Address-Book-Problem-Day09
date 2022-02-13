package AddressBookProblem;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateNewContactUc2 {

	private  String firstName;
	private String lastName;
	private String address;
	private String city;
	private int zipcode;
	private String state;
	private String phoneNo;
	private String email;

	static ArrayList<AddressBookP> contactBook = new ArrayList<>();

	public void createNewData() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first name : ");
		firstName = s.next();
		System.out.println("Enter the last name : ");
		lastName = s.next();
		System.out.println("Enter the address : ");
		address = s.next();
		System.out.println("Enter the city : ");
		city = s.next();
		System.out.println("Enter the state : ");
		state = s.next();
		System.out.println("Enter the zip code : ");
		zipcode = s.nextInt();
		System.out.println("Enter the phone number : ");
		phoneNo = s.next();
		System.out.println("Enter the email : ");
		email = s.next();
		AddressBook addressbook = new AddressBook(firstName , lastName , address , city , zipcode , state , phoneNo , email);
		contactBook.add(addressbook);
		System.out.println("\nContact added Successfully.");
	}

	public void displayContacts() {
		int i;
		System.out.println("\nContacts Present in Address Book:");
		for(i = 0 ; i < contactBook.size() ; i++) {
			System.out.println(contactBook.get(i));
		}
	}
	public static void main(String[] args) {

		CreateNewContactUc2 contact = new CreateNewContactUc2();
		contact.createNewData();
		contact.displayContacts();
	}

}



