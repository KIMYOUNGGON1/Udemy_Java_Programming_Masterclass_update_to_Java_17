package section_7;

public class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthOfDate, String hireDate, double hourlyPayRate) {
        super(name, birthOfDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay() {
        return 40 * hourlyPayRate;
    }

    public double getDoublePay() {
        return 2 * collectPay();
    }
}
