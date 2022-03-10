import java.util.ArrayList;
import java.util.Scanner;

public class Company {

    private static final int NUMBER_OF_EMPLOYEES = 5;
    static ArrayList<Employee> employees = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void start() {
        setUpListEmployee();
        while (menu()) ;
    }

    private void setUpListEmployee() {

        System.out.println("Enter 5 employee's date ");

        for (int c = 0; c < NUMBER_OF_EMPLOYEES; c++) {

            int order = c+1;

            System.out.println("Please enter employee's name " + order);
            String name = scan.nextLine();
            check(name);

            System.out.println("Please enter employee's surname " + order);
            String surname = scan.nextLine();
            check(surname);

            System.out.println("Please enter employee's salary " + order);
            double salary = Double.parseDouble(scan.nextLine());

            Employee e = new Employee(name, surname, salary);
            employees.add(e);

            System.out.println(e);

        }

    }

    private void check(String s) {
        if (s.length()==0)
            throw new IllegalStateException();
    }

    private void displayAllData() {
        for (Employee e : employees) {
            System.out.println(e.toString());
        }
    }

    private void allSalaries() {
        double salary = 0;
        for (int i = 0; i < employees.size(); i++) {
            salary += employees.get(i).getSalary();
        }
        System.out.println("The sum of the players salaries is " + salary);
    }

    private boolean menu() {
        System.out.println("1 – Print sum of all employees salary\n" +
                "\n" +
                "2 – Display all employees data\n" +
                "\n" +
                "3 – Add new employee\n" +
                "\n" +
                "4 – End program\n" +
                "\n" +
                "Pick number");
        int input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();


        switch (input) {
            case 1:
                System.out.println("Sum of all employees salary");
                allSalaries();
                break;
            case 2:
                displayAllData();
                break;
            case 3:
                new addEmployee();
                break;
            case 4:
                return false;
            default:
                throw new IllegalStateException("Unexpected value: " + input);
        }
        return true;
    }
}











