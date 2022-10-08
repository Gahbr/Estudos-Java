package Vetores;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Soma2Vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vão ter cada vetor? ");
        int n = sc.nextInt();
        int [] valoresA = new int[n];
        int [] valoresB = new int[n];
        int [] vetorResultante = new int[n];


        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < n; i++) {
            valoresA[i] = sc.nextInt();
        }
        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < n; i++) {
            valoresB[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < n; i++) {
            vetorResultante[i]= valoresA[i]+valoresB[i];
            System.out.println(vetorResultante[i]);
        }

       
    }
}
