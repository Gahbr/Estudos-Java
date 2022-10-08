package POO.salario.entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double NetSalary (){
        return grossSalary-tax;
    }
    public void IncreaseSalary(double percentage){
         grossSalary = grossSalary + (grossSalary* (percentage/100));
    }

    @Override
    public String toString() {
        return "Employee: " +
                name  +
                ", $= " + NetSalary();
    }
}
