package POO.triangulo;

import POO.triangulo.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Entre com as medidas do triângulo X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Entre com as medidas do triangulo Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        double areaX  = x.area();
        double areaY  = y.area();

        System.out.printf("Area do triangulo X: %.4f%n", areaX);
        System.out.printf("Area do triangulo Y: %.4f%n",areaY);

        if(areaX > areaY){
            System.out.println("Maior área é a de X");
        } else {
            System.out.println("Maior área é a de Y");
        }


    }


}
