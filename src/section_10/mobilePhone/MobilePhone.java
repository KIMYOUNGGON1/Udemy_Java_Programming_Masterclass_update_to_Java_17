package section_10.mobilePhone;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        return !myContacts.contains(contact) && myContacts.add(contact);
    }

    public boolean updateContact(Contact prevContact, Contact outContact) {
        return myContacts.remove(prevContact) && myContacts.add(outContact);
    }

    public boolean removeContact(Contact contact) {
        return myContacts.remove(contact);
    }

    public int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    public int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        for (Contact contact : myContacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

    public void printContacts() {
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println(myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }

}

class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber) {
        Contact contact = new Contact(name, phoneNumber);

        return contact;
    }

}
