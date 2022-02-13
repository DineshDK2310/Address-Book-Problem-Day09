package AddressBookProblem;
import java.util.ArrayList;
import java.util.Scanner;
public class EditContactUC3 extends CreateNewContactUc2 {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<AddressBook> contactBook = new ArrayList<>();

	public void editData() {

		System.out.println("\nEnter first name to edit :- ");
		String searchName = sc.next();
		for(int i = 0 ; i < contactBook.size() ; i++) {
			if(contactBook.get(i).getFirstName().equals(searchName)) {

				System.err.println("\nChose the  option to edit ");
				System.out.print("\n1.First Name \n2.Last Name \n3.Address \n4.City \n5.State \n6.Zipcode \n7.Phone Number \n8.Email Id :- ");
				int modify = sc.nextInt();
				switch(modify) {
				case 1:
					System.out.print("Enter new First Name :- ");
					contactBook.get(i).setFirstName(sc.next());
					System.out.print("First name is updated successfully :- ");
					break;
				case 2:
					System.out.print("Enter new Last Name :- ");
					contactBook.get(i).setLastName(sc.next());

					break;
				case 3:
					System.out.print("Enter new Address :- ");
					contactBook.get(i).setAddress(sc.next());

					break;
				case 4:
					System.out.print("Enter new City :- ");
					contactBook.get(i).setCity(sc.next());

					break;
				case 5:
					System.out.print("Enter new State :- ");
					contactBook.get(i).setState(sc.next());

					break;
				case 6:
					System.out.print("Enter new Zipcode :- ");
					contactBook.get(i).setZipcode(sc.nextInt());
					break;
				case 7:
					System.out.print("Enter new PhoneNumber :- ");
					contactBook.get(i).setPhoneNo(sc.next());
					break;
				case 8:
					System.out.print("Enter new Email Id :- ");
					contactBook.get(i).setEmail(sc.next());
					break;
				}
				System.out.println("Enter 1 if you want to continue");

			}
			else
				System.out.println("Please enter the correct first name");
		}

	}

	public static void main(String[] args) {

		EditContactUC3 editContact = new EditContactUc3();			
		editContact.createNewData();
		editContact.displayContacts();
		editContact.editData();
		editContact.displayContacts();


	}



}
