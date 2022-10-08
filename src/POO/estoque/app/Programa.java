package POO.estoque.app;

import POO.estoque.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);

        Produto produto = new Produto();
        System.out.println("Entre com os dados do produto");
        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        System.out.print("Quantidade em estoque:");
        int quantidade = sc.nextInt();
        System.out.println();

        produto.setNome(name);
        produto.setPreco(preco);
        produto.addProdutos(quantidade);

        System.out.println(produto);
        System.out.println();

        System.out.print("Entre com o numero de produtos para serem adicionados no estoque: ");
        quantidade = sc.nextInt();
        produto.addProdutos(quantidade);

        System.out.println();
        System.out.println("Produto atualizado: " + produto);

        System.out.println();
        System.out.print("Entre com o numero de produtos para serem removidos no estoque: ");
        quantidade = sc.nextInt();
         produto.removeProdutos(quantidade);

        System.out.println();
        System.out.println("$ Produto atualizado: " + produto);

        sc.close();
    }
}
