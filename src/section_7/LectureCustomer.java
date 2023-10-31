package section_7;

public class LectureCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public LectureCustomer() {
        this("Nobody", "nobody@noWhere.com");
    }

    public LectureCustomer(String name, String email) {
        this(name, 1000, email);
    }

    public LectureCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
