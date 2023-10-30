package section_7;

public class CustomerClassCheck {
    public static void main(String[] args) {
        Customer ct = new Customer("Kim", "10000", "Test@Test.com");

        System.out.println(ct.getCreditLimit());
        System.out.println(ct.getName());
        System.out.println(ct.getEmailAddress());

        Customer ct_1 = new Customer();

        System.out.println(ct_1.getCreditLimit());
        System.out.println(ct_1.getEmailAddress());
        System.out.println(ct_1.getName());

        Customer ct_2 = new Customer("creditLimit", "Test2@test.com");

        System.out.println(ct_2.getCreditLimit());
        System.out.println(ct_2.getEmailAddress());
        System.out.println(ct_2.getName());
    }
}
