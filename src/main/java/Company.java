import java.util.ArrayList;

public class Company {
    static ArrayList<Employee> employees = new ArrayList<>();

    public void displayEmployeeData() {
        for (Employee employees : employees) {
            System.out.println(employees.toString());
        }
    }

    public void displaySalaries() {
        double salary = 0;
        for (int i = 0; i < employees.size(); i++) {
            salary += employees.get(i).getSalary();
        }
        System.out.println(salary + " $");
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}












