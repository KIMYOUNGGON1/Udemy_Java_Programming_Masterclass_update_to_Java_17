package section_7;

public class LectureClassesChallenge {
    public static void main(String[] args) {

//        LectureBankAccount LBA = new LectureBankAccount("12345", 500, "YoungGon Kim",
//                "test@naver.com", "(031) 333-4444");

        LectureBankAccount LBA = new LectureBankAccount();

        System.out.println(LBA.getNumber());
        System.out.println(LBA.getBalance());

//        LBA.setNumber("12345");
//        LBA.setBalance(1000.00);
//        LBA.setCustomerName("YoungGon Kim");
//        LBA.setCustomerEmail("test@naver.com");
//        LBA.setCustomerPhone("(031) 333-4444");

        LBA.withdrawFunds(100.0);
        LBA.depositFunds(250);
        LBA.withdrawFunds(50);

        LBA.withdrawFunds(200);

        LBA.depositFunds(100);
        LBA.withdrawFunds(45.55);
        LBA.withdrawFunds(54.46);

        LBA.withdrawFunds(54.45);

        LectureBankAccount LBA_1 = new LectureBankAccount("Kim", "Kim@test.com",
                "12345");
        System.out.println("AccountNo : " + LBA_1.getNumber() +
                "; name " + LBA_1.getCustomerName());
    }
}
