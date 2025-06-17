import java.util.ArrayList;

public class AfeezContactList {

public static class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Contact(String first, String last, String phone) {
        this.firstName = first;
        this.lastName = last;
        this.phoneNumber = phone;
    }
public String getFirstName() {
    return firstName;
}

public String getLastName() {
    return lastName;
}

public String getPhoneNumber() {
    return phoneNumber;
}

public void setFirstName(String name) {
    this.first Name = name;
}

public void setLastName(String name) {
    this.lastName = name;
}

public void setPhoneNumber(String phone) {
    this.phoneNumber = phone;
}

@Override
public String toString() {
    return firstName + " " + lastName + " - " + phoneNumber;
}
    
}


    public static ArrayList<Contact> contacts = new ArrayList<>();

    public static String addContact(Contact contact) {
        String phoneNumber = contact.getPhoneNumber();

        if (phoneNumber.length() != 11 || !phoneNumber.startsWith("0") || !onlyDigits(phoneNumber)) {
            return "Invalid phone number. It must be 11 digits and start with 0.";
        }

        for (int num = 0; num < contacts.size(); num++) {
            Contact existing = contacts.get(num);
            if (existing.getPhoneNumber().equals(phoneNumber)) {
                return "Phone number already exists.";
            }
        }

        contacts.add(contact);
        return "Contact added: " + contact;
    }

    public static boolean onlyDigits(String str) {
        for (int num = 0; num < str.length(); num++) {
            char digit = str.charAt(num);
            if (!Character.isDigit(digit)) {
                return false;
            }
        }
        return true;
    }

    public static String removeContact(String phoneNumber) {
        for (int num = 0; num < contacts.size(); num++) {
            Contact contact = contacts.get(num);
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                contacts.remove(num);
                return "Contact removed: " + contact;
            }
        }
        return "Contact with phone number " + phoneNumber + " not found.";
    }

    public static ArrayList<Contact> findByFirstName(String firstName) {
        ArrayList<Contact> result = new ArrayList<>();
        for (int num = 0; num < contacts.size(); num++) {
            Contact contact = contacts.get(num);
            if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                result.add(contact);
            }
        }
        return result;
    }

    public static ArrayList<Contact> findByLastName(String lastName) {
        ArrayList<Contact> result = new ArrayList<>();
        for (int num = 0; num < contacts.size(); num++) {
            Contact contact = contacts.get(num);
            if (contact.getLastName().equalsIgnoreCase(lastName)) {
                result.add(contact);
            }
        }
        return result;
    }

  public static Contact findByPhone(String phoneNumber) {
    for (int num = 0; num < contacts.size(); num++) {
        Contact contact = contacts.get(num);
        if (contact.getPhoneNumber().equals(phoneNumber)) {
            return contact;         }
    }
    return null;
}

    public static String editContact(String phone, String newFirst, String newLast, String newPhone) {
        Contact contact = findByPhone(phone);
        if (contact != null) {
            contact.setFirstName(newFirst);
            contact.setLastName(newLast);
            contact.setPhoneNumber(newPhone);
            return "Contact updated to: " + contact.getPhoneNumber();
        }
        return "Contact with phone number " + phone + " not found.";
    }
}