package Vetores;

import Vetores.entities.Pessoa;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();
        Pessoa [] pessoa = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %dº pessoa : ", i+1);
            double altura = sc.nextDouble();
            System.out.printf("Gênero da %dº pessoa : ", i+1);
            char genero = sc.next().charAt(0);
            pessoa[i] = new Pessoa(altura,genero);

        }

        System.out.println();
       double menorAltura =  Arrays.stream(pessoa).mapToDouble(Pessoa::getAltura).min().getAsDouble();
        System.out.println("Menor altura: "+ menorAltura);

       double maiorAltura = Arrays.stream(pessoa).mapToDouble(Pessoa::getAltura).max().getAsDouble();
        System.out.println("Maior altura: " + maiorAltura);

        double somaAlturaM= 0;
        int quantMulheres = 0;
        int quantHomens = 0;

        for (int i = 0; i < pessoa.length; i++) {
            if(pessoa[i].getGenero() == 'f' || pessoa[i].getGenero() == 'F'){
                somaAlturaM += pessoa[i].getAltura();
                quantMulheres++;
            }else{
                quantHomens++;
            }
        }

        System.out.printf("Média das alturas das mulheres = %.2f %n",somaAlturaM/quantMulheres);
        System.out.println("Número de homens = "+quantHomens);
    }
}
