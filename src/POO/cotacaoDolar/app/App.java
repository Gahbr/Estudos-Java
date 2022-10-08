package POO.cotacaoDolar.app;

import POO.cotacaoDolar.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price?");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought?");
        double dollarsBought = sc.nextDouble();
        System.out.printf("Amount to be paid in Reais = %.2f", CurrencyConverter.dollarsToReais(dollarPrice,dollarsBought));

    }
}
