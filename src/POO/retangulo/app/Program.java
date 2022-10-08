package POO.retangulo.app;

import POO.retangulo.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);
        Rectangle r1 = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        r1.width = sc.nextDouble();
        r1.height = sc.nextDouble();

        System.out.println(r1);


    }
}
