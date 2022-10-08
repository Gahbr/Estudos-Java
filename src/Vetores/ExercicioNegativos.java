package Vetores;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioNegativos {
//    Fa�a um programa que leia um n�mero inteiro positivo N (m�ximo = 10) e depois N n�meros inteiros
//    e armazene-os em um vetor. Em seguida, mostrar na tela todos os n�meros negativos lidos.

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        if(n>10 || n < 0){
            sc.close();
            throw  new Exception("Insira um n�mero inteiro positivo (max = 10)");
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
