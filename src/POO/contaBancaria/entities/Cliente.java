package POO.contaBancaria.entities;

public class Cliente {
    private String name;
    private int conta;
    private double saldo;

    public Cliente(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta){
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    // METODOS
    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        saldo -= valor+5;
    }

    @Override
    public String toString() {
        return "Cliente { " +
                "name='" + name + '\'' +
                ", conta=" + conta +
                ", saldo=" + saldo +
                " }";
    }
}
