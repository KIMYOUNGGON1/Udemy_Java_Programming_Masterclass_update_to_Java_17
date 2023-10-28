package section_7;

public class ClassesChallenge {
    public static void main(String[] args) {
        BankAccount bc = new BankAccount();

        bc.setAccountNumber("11110000");
        bc.setAccountBalance("10000");
        bc.setCustomerName("Young gon Kim");
        bc.setEmail("test@naver.com");
        bc.setPhoneNumber("010-1111-1111");

        bc.depositingFunds("11110000", "1000");
        bc.withDrawingFunds("11110000", "12000");
    }
}
