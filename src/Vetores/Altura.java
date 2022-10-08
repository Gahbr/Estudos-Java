package Vetores;

import Vetores.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {
//        Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//bem como os nomes dessas pessoas caso houver.

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantas pessoas serão digitadas:");
        int n = sc.nextInt();
        Pessoa[] pessoa = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("Dados da %dº pessoa: %n",i+1);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            pessoa[i] = new Pessoa(nome,idade,altura);
        }

        //média das alturas
        double somaAlturas=0;
        for (int i = 0; i < pessoa.length; i++) {
           somaAlturas+= pessoa[i].getAltura();
        }

       double mediaAlturas = somaAlturas/ pessoa.length;
        System.out.println();
        System.out.printf("Altura média: %.2fm %n", mediaAlturas);

        //Pessoas com menos de 16 anos
        double adolescentes = 0;
        for (int i = 0; i < pessoa.length; i++) {
            if(pessoa[i].getIdade() < 16){
                adolescentes++;
            }
        }
        double porcentagemAdolescentes = (adolescentes/pessoa.length) * 100;
        System.out.printf("Pessoas com menos de 16 anos: %.2f%% %n", porcentagemAdolescentes );

        for (Pessoa adolescente : pessoa) {
            if (adolescente.getIdade() < 16) {
                System.out.println(adolescente.getNome());
            }
        }
        sc.close();
    }
}
