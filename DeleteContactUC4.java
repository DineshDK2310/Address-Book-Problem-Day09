package AddressBookProblem;
import java.util.Scanner;
public class DeleteContactUC4 extends EditContactUC3 {
	static Scanner s = new Scanner(System.in);

	public void deleteData() {

		System.out.println("\nEnter first name to delete : ");
		String searchName = s.next();
		for(int i = 0 ; i < contactBook.size() ; i++)
		{
			if(contactBook.get(i).getFirstName().equals(searchName)) {
				contactBook.remove(contactBook);
				System.out.println("Deleted the person details");
			}
			else
				System.out.println("Person Details not deleted");
		}
	}

	public static void main(String[] args) {

		DeleteContactUC4 deleteContact = new DeleteContactUC4();			

		EditContactUC3 editContact = new EditContactUC3();			
		editContact.createNewData();
		editContact.displayContacts();
		editContact.editData();
		editContact.displayContacts();
		deleteContact.deleteData();

	}
}
