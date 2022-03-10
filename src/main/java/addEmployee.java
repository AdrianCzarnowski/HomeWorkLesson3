import java.util.Scanner;

public class addEmployee {

    Scanner input = new Scanner(System.in);


    public addEmployee() {

        System.out.println("Please enter employee name: ");
        String name = input.nextLine();

        System.out.println("Please enter employee surname: ");
        String surname = input.nextLine();

        System.out.println("Please enter employee salary: ");
        double salary = input.nextDouble();

        Company.employees.add(new Employee(name, surname, salary));

        String getAllData = name + " " + surname + " " + salary + " $";
        System.out.println((getAllData) + " Added!");

    }

}







