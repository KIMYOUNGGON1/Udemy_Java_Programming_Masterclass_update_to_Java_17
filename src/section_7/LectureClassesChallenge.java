package section_7;

public class LectureClassesChallenge {
    public static void main(String[] args) {
        LectureBankAccount LBA = new LectureBankAccount();

        LBA.setNumber("12345");
        LBA.setBalance(1000.00);
        LBA.setCustomerName("YoungGon Kim");
        LBA.setCustomerEmail("test@naver.com");
        LBA.setCustomerPhone("(031) 333-4444");

        LBA.withdrawFunds(100.0);
        LBA.depositFunds(250);
        LBA.withdrawFunds(50);

        LBA.withdrawFunds(200);

        LBA.depositFunds(100);
        LBA.withdrawFunds(45.55);
        LBA.withdrawFunds(54.46);

        LBA.withdrawFunds(54.45);
    }
}
