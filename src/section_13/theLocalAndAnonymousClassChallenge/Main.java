package section_13.theLocalAndAnonymousClassChallenge;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("KIM", "YOUNGGON", "2023/12/18"),
                new Employee("YUN", "JUNHO", "2023/01/02"),
                new Employee("KIM", "SEUNGGON", "2023/01/02"),
                new Employee("KIM", "HANSOL", "2021/03/02"),
                new Employee("LEE", "HEWON", "2022/05/02")
        ));

        class WrappedEmployee {
            private final Employee employee;
            private final String fullName;
            private final long yearsWorked;

            public WrappedEmployee(Employee employee) {
                this.employee = employee;
                this.fullName = employee.firstName() + " " + employee.lastName();
                this.yearsWorked = calculateYearsWorked(employee.hireDate());
            }

            private long calculateYearsWorked(String hireDate) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                LocalDate hireDateLocal = LocalDate.parse(hireDate, formatter);
                return ChronoUnit.YEARS.between(hireDateLocal, LocalDate.now());
            }

            public String getFullName() {
                return fullName;
            }

            public long getYearsWorked() {
                return yearsWorked;
            }

            @Override
            public String toString() {
                return "WrappedEmployee{" +
                        "employee=" + employee +
                        ", fullName='" + fullName + '\'' +
                        ", yearsWorked=" + yearsWorked +
                        '}';
            }
        }

        List<WrappedEmployee> wrappedEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            wrappedEmployees.add(new WrappedEmployee(employee));
        }

        wrappedEmployees.sort(new Comparator<WrappedEmployee>() {
            @Override
            public int compare(WrappedEmployee o1, WrappedEmployee o2) {
                return o1.getFullName().compareTo(o2.getFullName());
            }
        });

        for (WrappedEmployee wrappedEmployee : wrappedEmployees) {
            System.out.println(wrappedEmployee);
        }

    }
}
