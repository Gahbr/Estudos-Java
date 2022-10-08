package POO.cotacaoDolar.util;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double dollarsToReais(double dollarPrice, double dollarsBought){
      return dollarPrice * dollarsBought * (1 + IOF);
    }
}
