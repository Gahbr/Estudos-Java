package Vetores;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] numeros = new double[n];
        for (int i = 0; i <n ; i++) {
            System.out.print("Digite um número:");
            numeros[i]=sc.nextDouble();
        }
      double soma =  Arrays.stream(numeros).sum();
        System.out.println("VALORES: " + Arrays.toString(numeros));
        System.out.println("SOMA: " + soma);
        System.out.printf("MEDIA: %.2f", soma/n);
    }
}
