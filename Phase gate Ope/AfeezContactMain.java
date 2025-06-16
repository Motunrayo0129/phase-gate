import java.util.Scanner;
import java.util.ArrayList;

	public class AfeezContactMain  {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

String option = """
=========================================================
		Afeez PhoneBook
==========================================================
Press=====>
	1.Add contact
	2.Find by FirstName
	3. Find by LastName
	4. Find by Phone Number
	5. Remove Contact
	6. Edit Contact
	7. Exit
____________________________________________________________
""";
	System.out.println(option);

	while (running) {
	System.out.print("Enter option: ");
	int choice = input.nextInt();
	
	 switch (choice) {
                case 1: 
                    System.out.print("First Name: ");
                    String first = input.nextLine();
                    System.out.print("Last Name: ");
                    String last = input.nextLine();
                    System.out.print("Phone Number: ");
                    String phone = input.nextLine();

                    AfeezContactList.Contact newContact = new AfeezContactList.Contact(first, last, phone);
                    System.out.println(AfeezContactList.addContact(newContact));
                    break;

	 case 2: 
                    System.out.print("Enter first name to search: ");
                    String searchFirst = input.next();
ArrayList<AfeezContactList.Contact> firstMatches = AfeezContactList.findByFirstName(searchFirst);
for (int num = 0; num < firstMatches.size(); num++) {
    System.out.println(firstMatches.get(num));
}
        break;
                case 3: 
                    System.out.print("Enter last name to search: ");
               String searchLast = input.nextLine();
               ArrayList<AfeezContactList.Contact> lastMatches = AfeezContactList.findByLastName(searchLast);
                   for (int num = 0; num < lastMatches.size(); num++) {
    System.out.println(lastMatches.get(num));
}

                    break;
		case 4: 
            System.out.print("Enter phone number to search: ");
            String phoneSearch = input.nextLine();
     AfeezContactList.Contact found = AfeezContactList.findByPhone(phoneSearch);
        System.out.println(found != null ? "Contact found: " + found : "No contact found.");
                    break;
	 case 5: 
                    System.out.print("Enter phone number to remove: ");
                    String phoneRemove = input.nextLine();
                    System.out.println(AfeezContactList.removeContact(phoneRemove));
                    break;

                case 6: 
                    System.out.print("Enter phone number of contact to edit: ");
                    String phoneEdit = input.nextLine();
                    System.out.print("New First Name: ");
                    String newFirst = input.nextLine();
                    System.out.print("New Last Name: ");
                    String newLast = input.nextLine();
                    System.out.print("New Phone Number: ");
                    String newPhone = input.nextLine();
                    System.out.println(AfeezContactList.editContact(phoneEdit, newFirst, newLast, newPhone));
                    break;

               case 7:
                    System.out.println("Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Try again.");


	}

		}











}
    }