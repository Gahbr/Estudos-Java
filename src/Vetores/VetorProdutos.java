package Vetores;

import Vetores.entities.Product;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class VetorProdutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        Product [] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.print("Insira o nome do produto: ");
            String name =sc.nextLine();
            System.out.print("Preço: $");
            double price = sc.nextDouble();
            vect[i] = new Product(name,price);
        }

     double sum = 0;
        for(int i= 0; i <n; i++){
            sum+= vect[i].getPrice();
        }

    double avg = sum/n;

//    //MÉTODO NOVO
//        double soma = Arrays.stream(vect).mapToDouble(Product::getPrice).sum();
//        System.out.println("Soma é: "+ soma);

        System.out.printf("SUM: %.2f %n",sum);
        System.out.printf("AVERAGE PRICE : %.2f",avg);
    }
}
