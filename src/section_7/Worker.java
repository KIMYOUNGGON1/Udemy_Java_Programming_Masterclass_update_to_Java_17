package section_7;

public class Worker {
    private String name;
    private String birthOfDate;
    protected String endDate;

    public Worker() {

    }

    public Worker(String name, String birthOfDate) {
        this.name = name;
        this.birthOfDate = birthOfDate;
    }

    public int getAge() {
        int currentYear = 2025;
        int birthYear = Integer.parseInt(birthOfDate.substring(6));

        return (currentYear - birthYear);
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthOfDate='" + birthOfDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}