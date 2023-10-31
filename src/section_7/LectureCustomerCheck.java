package section_7;

public class LectureCustomerCheck {

    public static void main(String[] args) {
        LectureCustomer lectureCustomer = new LectureCustomer("Tim", 1000, "tim@email.com");
        System.out.println(lectureCustomer.getName());
        System.out.println(lectureCustomer.getCreditLimit());
        System.out.println(lectureCustomer.getEmail());

        LectureCustomer secondLectureCustomer = new LectureCustomer();

        System.out.println(secondLectureCustomer.getName());
        System.out.println(secondLectureCustomer.getCreditLimit());
        System.out.println(secondLectureCustomer.getEmail());

        LectureCustomer thirdLectureCustomer = new LectureCustomer("Joe", "joe@email.com");

        System.out.println(thirdLectureCustomer.getName());
        System.out.println(thirdLectureCustomer.getCreditLimit());
        System.out.println(thirdLectureCustomer.getEmail());
    }
}
