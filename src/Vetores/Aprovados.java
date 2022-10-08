package Vetores;

import Vetores.entities.Estudantes;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos você vai digitar? ");
        int n = sc.nextInt();
        Estudantes[] aluno= new Estudantes[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o nome, primeira e segunda nota do %dº aluno: %n",i+1);
            sc.nextLine();
            String nome = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();

            aluno[i]=  new Estudantes(nome,nota1,nota2);

        }
        System.out.println("Alunos aprovados: ");

        for (int i = 0; i < n; i++) {
            double media =  (aluno[i].getNota1()+ aluno[i].getNota2())/2;
            if(media >=6 ){
                System.out.println(aluno[i].getName());
            }
        }

    }
}
