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
        if (myContacts.contains(contact)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean updateContact(Contact prevContact, Contact outContact) {
        if (myContacts.contains(prevContact) &&
            myContacts.add(outContact)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(Contact contact) {
        if (myContacts.contains(contact)) {
            myContacts.remove(contact);
            return true;
        } else {
            return false;
        }
    }

    public int findContact(Contact contacts) {
        if (myContacts.contains(contacts)) {
            int index = myContacts.indexOf(contacts);
            return index;
        } else {
            return -1;
        }
    }

    public int findContact(String contacts) {
        if (myContacts.contains(contacts)) {
            int index = myContacts.indexOf(contacts);
            return index;
        } else {
            return -1;
        }
    }

    public Contact queryContact(String parameter) {
        if (myContacts.contains(parameter)) {
            return
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
