import java.util.Scanner;
public class addEmployee {

    Scanner input = new Scanner(System.in);


    public addEmployee() {

        System.out.println("Name: ");
        String name = input.nextLine();

        System.out.println("Surname: ");
        String surname = input.nextLine();

        System.out.println("Salary: ");
        double salary = input.nextDouble();

        String getAllData = name + " " + surname + " " + salary + " $";
        Company.employees.add(new Employee(name, surname, salary));

        System.out.println((getAllData) + " Added!");

    }

}







