package section_7;

public class Worker {
    private String name;
    private String birthOfDate;
    private String endDate;

    public Worker(String name, String birthOfDate, String endDate) {
        this.name = name;
        this.birthOfDate = birthOfDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {

    }

    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Kim", "20/09/1995",
                "20/09/2090", 1234L, "01/09/2022", 3500, false);

        salariedEmployee.retired();
    }
}

class Employee extends Worker{
    private long employeeId;
    private String hireDate;

    public Employee(String name, String birthOfDate, String endDate, long employeeId, String hireDate) {
        super(name, birthOfDate, endDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }

}

class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthOfDate, String endDate, long employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthOfDate, endDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retired() {

    }
}

class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthOfDate, String endDate, long employeeId, String hireDate, double hourlyPayRate) {
        super(name, birthOfDate, endDate, employeeId, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public void getDoublePay() {

    }
}