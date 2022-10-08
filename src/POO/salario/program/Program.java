package POO.salario.program;

import POO.salario.entities.Employee;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("employee data: ");
        System.out.print("Name:");
        employee.name = sc.nextLine();
        System.out.print("Gross Salary:");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax:");
        employee.tax = sc.nextDouble();

        System.out.println();
        System.out.println(employee.toString());

        System.out.println("Which percentage to increase salary?");
        employee.IncreaseSalary(sc.nextDouble());
        System.out.println("Updated data: "+ employee.toString());
        sc.close();
    }
}
