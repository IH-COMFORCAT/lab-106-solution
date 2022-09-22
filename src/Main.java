import classes.Employee;
import classes.Intern;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("employees.txt");

        List<Employee> employees = Arrays.asList(
                new Employee(25000, "Pepe", "Marketing"),
                new Intern(21000, "Antonio", "Becarios", 12),
                new Intern(19000, "Felipe", "Becarios", 6),
                new Employee(20000, "Maria", "IT"),
                new Employee(35000, "Roxanne", "IT")
        );

        for (Employee e : employees) {
            writer.write(e.toString());
            System.out.println(e);
        }
        writer.close();




    }
}