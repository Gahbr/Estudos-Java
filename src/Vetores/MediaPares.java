package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        int [] vetor = new int[n];
        int numPares = 0;
        int soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
            if(vetor[i] %2==0){
                soma+=vetor[i];
                numPares++;
            }
        }

        if(soma>0){
            System.out.println("MEDIA DOS PARES: " +soma/numPares);
        }else System.out.println("NENHUM PAR");

        sc.close();
    }
}
