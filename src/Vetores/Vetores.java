package Vetores;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        int n = sc.nextInt();
        double [] vect = new double [n];

        for (int i = 0; i <n ; i++) {
            vect[i] = sc.nextDouble();
        }

        double sum = Arrays.stream(vect).sum();
        double avg = sum/n;


        System.out.printf("AVERAGE HEIGHT: %.2f",avg);
        sc.close();
    }
}
