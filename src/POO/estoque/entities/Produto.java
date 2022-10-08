package POO.estoque.entities;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    //Construtor

    public Produto() {
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //get set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }


    //metodos

    public double valorTotal(){
        return preco * quantidade;
    }

    public void addProdutos( int quantidade){
        this.quantidade += quantidade;
    }

    public void removeProdutos(int quantidade){
        this.quantidade -= quantidade;
    }

    @Override
    public String toString() {
        return "Dados do Produto: " +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade + " unidades";
    }
}
