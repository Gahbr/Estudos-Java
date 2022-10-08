package Collections.Interrogatorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> respostas  = new ArrayList<>();

        System.out.println("INTERROGATÓRIO SOBRE UM CRIME");
        System.out.println("-------------");
        System.out.println("Telefonou para a vítima? [sim ou não]"); respostas.add(sc.nextLine());
        System.out.println("Esteve no local do crime? [sim ou não]"); respostas.add(sc.nextLine());
        System.out.println("Mora perto da vítima? [sim ou não]"); respostas.add(sc.nextLine());
        System.out.println("Devia para a vítima? [sim ou não]"); respostas.add(sc.nextLine());
        System.out.println("Já trabalhou com a vítima? [sim ou não]"); respostas.add(sc.nextLine());

        System.out.println(respostas);
        int contador = 0;
        for (int i = 0; i < respostas.size(); i++) {
            switch (respostas.get(i)){
                case "sim":
                case "SIM":
                case "Sim" :
                    contador++;
                    break;
            }
        }

        System.out.println("Resultado do interrogatório:");
        if(contador==2){
            System.out.println("PESSOA SUSPEITA");
        }else if (contador>2 && contador <5){
            System.out.println("PESSOA CÚMPLICE");
        } else if (contador == 5){
            System.out.println("ASSASSINA!");
        }else {
            System.out.println("INOCENTE");
        }
        System.out.println(contador);


    }
}
