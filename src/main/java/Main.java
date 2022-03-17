import java.util.Scanner;

public class Main {

    private static int NUMBER_OF_EMPLOYEES = 5;

    public static void main(String[] args) {
        Company company = new Company();
        setupInitialEmployeeFromUser(company);
        while (true) {
            prinMenu();
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Sum of all employees salary :");
                    company.displaySalaries();
                    break;
                case 2:
                    company.displayEmployeeData();
                    break;
                case 3:
                    company.addEmployee(UseInputHandler.getEmployee(1));
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Unexpected value: " + input);
            }

        }
    }

    private static void prinMenu() {
        System.out.println("1 – Print sum of all employees salary\n" +
                "\n" +
                "2 – Display all employees data\n" +
                "\n" +
                "3 – Add new employee\n" +
                "\n" +
                "4 – End program\n" +
                "\n" +
                "Pick number");
    }

    private static void setupInitialEmployeeFromUser(Company company) {

        System.out.println("Enter 5 employee's data ");

        for (int i = 0; i < NUMBER_OF_EMPLOYEES; i++) {
            company.addEmployee(UseInputHandler.getEmployee(i + 1));

        }
    }
}


