package section_7;

public class SalariedEmployee extends Employee {
    double annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthOfDate, String hireDate, double annualSalary) {
        super(name, birthOfDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {
        double payCheck = annualSalary / 26;
        double adjustedPay = (isRetired) ? 0.9 * payCheck : payCheck;

        return (int) adjustedPay;
    }

    public void retired() {
        terminate("12/12/2025");
        isRetired = true;
    }
}
