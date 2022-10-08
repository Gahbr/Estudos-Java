package Vetores;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioNegativos {
//    Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//    e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        if(n>10 || n < 0){
            sc.close();
            throw  new Exception("Insira um número inteiro positivo (max = 10)");
        }

     int[] numeros = new int[n];

        for (int i = 0; i < n ; i++) {
          numeros[i] = sc.nextInt();
        }

        //verifica numeros negativos
        int[] result = Arrays.stream(numeros).filter(x->x<0).toArray();

        if(result.length>0){
            System.out.println("NUMEROS NEGATIVOS:");
            for(int obj : result){
                System.out.println(obj);
            }
        }

    }
}
