package Vetores;

import Vetores.entities.Pessoa;

import java.util.Arrays;
import java.util.Locale;
import java.util.OptionalInt;
import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();
        Pessoa[] pessoa= new Pessoa[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("DADOS DA %dº PESSOA: %n", i+1);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade= sc.nextInt();
            pessoa[i] = new Pessoa(nome,idade);
        }

        // procurando pessoa mais velha
        int idadePessoaVelha = Arrays.stream(pessoa).mapToInt(Pessoa::getIdade).max().getAsInt();
        String pessoaMaisVelha = "";

        for (int i = 0; i < n; i++) {
            if (pessoa[i].getIdade()== idadePessoaVelha){
                pessoaMaisVelha = pessoa[i].getNome();
            }
        }
        System.out.println("PESSOA MAIS VELHA: " +pessoaMaisVelha);

    }
}
