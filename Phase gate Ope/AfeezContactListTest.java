import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class AfeezContactListTest {

    @BeforeEach
    public void setup() {
        AfeezContactList.contacts.clear();
    }

    @Test
    public void testAddValidContact() {
        AfeezContactList.Contact contact = new AfeezContactList.Contact("Afeez", "Ope", "08012345678");
        String result = AfeezContactList.addContact(contact);
        assertEquals("Contact added: " + contact, result);
        assertEquals(1, AfeezContactList.contacts.size());
    }

    @Test
    public void testAddDuplicatePhoneNumber() {
        AfeezContactList.Contact contact1 = new AfeezContactList.Contact("Afeez", "Ope", "08012345678");
        AfeezContactList.Contact contact2 = new AfeezContactList.Contact("Tunde", "Ajayi", "08012345678");

        AfeezContactList.addContact(contact1);
        String result = AfeezContactList.addContact(contact2);
        assertEquals("Phone number already exists.", result);
    }

    @Test
    public void testInvalidPhoneNumber() {
        AfeezContactList.Contact contact = new AfeezContactList.Contact("Wrong", "Format", "1234");
        String result = AfeezContactList.addContact(contact);
        assertTrue(result.contains("Invalid phone number"));
    }

    @Test
    public void testRemoveContactSuccess() {
        AfeezContactList.Contact contact = new AfeezContactList.Contact("Jane", "Doe", "08000000000");
        AfeezContactList.addContact(contact);
        String result = AfeezContactList.removeContact("08000000000");
        assertTrue(result.contains("Contact removed"));
        assertEquals(0, AfeezContactList.contacts.size());
    }

    @Test
    public void testFindByFirstName() {
        AfeezContactList.Contact contact = new AfeezContactList.Contact("James", "Bond", "08011112222");
        AfeezContactList.addContact(contact);

        ArrayList<AfeezContactList.Contact> result = AfeezContactList.findByFirstName("james");
        assertFalse(result.isEmpty());
        assertEquals("James", result.get(0).getFirstName());
    }

    @Test
    public void testEditContact() {
        AfeezContactList.Contact contact = new AfeezContactList.Contact("Ola", "Daniel", "08099998888");
        AfeezContactList.addContact(contact);
        String result = AfeezContactList.editContact("08099998888", "Olaoluwa", "Dan", "08088887777");
        assertTrue(result.contains("08088887777"));
    }
}