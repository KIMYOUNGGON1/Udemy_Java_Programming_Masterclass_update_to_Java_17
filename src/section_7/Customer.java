package section_7;

public class Customer {

    private String name;
    private String creditLimit;
    private String emailAddress;

    public Customer(String name, String creditLimit, String emailAddress) {
        System.out.println("This message will show when you call constructor with three parameter.");
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public Customer() {
        this("kim", "1000", "test@test.com)");
        System.out.println("This message will show when you call the no-args constructor.");
    }

    public Customer(String creditLimit, String emailAddress) {
        this("SecondName", creditLimit, emailAddress);
        System.out.println("This message will show when you call constructor with two parameter.");
    }

    public String getName() {
        return name;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
