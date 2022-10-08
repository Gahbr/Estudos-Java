package POO.contaBancaria;

import POO.contaBancaria.entities.Cliente;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();

        System.out.print("Informe o numero da conta:");
        int numConta = sc.nextInt();
        cliente.setConta(numConta);
        sc.nextLine();

        System.out.print("Informe o nome do titular da conta:");
        String nomeConta = sc.nextLine();
        cliente.setName(nomeConta);


        System.out.println("Deseja fazer um depósito inicial? 1 - Sim, 2 - Não");
        if(sc.nextInt()==1){
            System.out.print("Insira o valor: ");
            cliente.depositar(sc.nextDouble());
            System.out.println(cliente.toString());
        }

        System.out.println("Deposite algum dinheiro");
        cliente.depositar(sc.nextDouble());
        System.out.println(cliente.toString());

        System.out.println("Deseja fazer um saque? 1 - Sim, 2 - Não");
        if(sc.nextInt()==1){
            System.out.print("Insira o valor: ");
            cliente.sacar(sc.nextDouble());
            System.out.println(cliente.toString());
        }


    }
}
