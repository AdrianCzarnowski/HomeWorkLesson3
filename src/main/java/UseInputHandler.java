import java.util.Scanner;

public class UseInputHandler {


    public static Employee getEmployee(int number) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter employee's name " + number);

        String name = scan.nextLine();
        validateInput(name);

        System.out.println("Please enter employee's surname " + number);
        String surname = scan.nextLine();
        validateInput(surname);

        System.out.println("Please enter employee's salary " + number);
        double salary = Double.parseDouble(scan.nextLine());

        return new Employee(name, surname, salary);
    }
    private static void validateInput(String enter) {
        if (enter.length() == 0)
            throw new IllegalStateException();
    }

}
