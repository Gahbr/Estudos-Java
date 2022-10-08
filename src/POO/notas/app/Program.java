package POO.notas.app;

import POO.notas.entities.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter student's name:");
       student.name = sc.nextLine();
        System.out.print("Enter student's first grade:");
       student.nota1 =sc.nextDouble();
        System.out.print("Enter student's second grade:");
       student.nota2= sc.nextDouble();
        System.out.print("Enter student's third grade:");
       student.nota3= sc.nextDouble();
        System.out.println();
        System.out.println("FINAL GRADE = " +student.FinalGrade());
        System.out.println(student.checkGrades());
    }
}
