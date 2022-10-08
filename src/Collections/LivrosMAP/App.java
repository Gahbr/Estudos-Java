package Collections.LivrosMAP;

import java.util.*;

public class App {
    public static void main(String[] args) {

        System.out.println("Ordem aleatória");
        Map<String,Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve história no tempo",256));
            put("Duhigg, Charles", new Livro("O poder do hábito",408));
            put("Harari, Yuval Noah", new Livro("21 lições para o século 21",432));
        }};
        for(Map.Entry<String,Livro> livro : meusLivros.entrySet()){
            System.out.println(livro.getKey() + "- " + livro.getValue().getNome());
        }
        System.out.println();

        System.out.println("Ordem de inserção");
        Map<String, Livro> livroPorInsert = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve história no tempo",256));
            put("Duhigg, Charles", new Livro("O poder do hábito",408));
            put("Harari, Yuval Noah, Stephen", new Livro("21 lições para o século 21",432));
        }};

        for (Map.Entry<String,Livro> livro : livroPorInsert.entrySet()){
            System.out.println(livro.getKey() + "- " + livro.getValue().getNome());
        }
        System.out.println();

        System.out.println("Ordem por nome dos autores");
        Map<String, Livro> livroPorAutor = new TreeMap<>(meusLivros);
        for(Map.Entry<String,Livro> livro : livroPorAutor.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        System.out.println();

        System.out.println("Ordem por nome dos livros");
        Set<Map.Entry <String, Livro>> livroPorLivro = new TreeSet<>(new ComparatorNomeLivro());
        livroPorLivro.addAll(meusLivros.entrySet());

        for(Map.Entry<String,Livro> livro : livroPorLivro){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        System.out.println();

        System.out.println("Ordem por número de páginas");
        Set<Map.Entry <String,Livro>> livroPorPag = new TreeSet<>(new ComparatorPaginas());
        livroPorPag.addAll(meusLivros.entrySet());

        for(Map.Entry<String,Livro> livro : livroPorPag){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getPaginas() + " Páginas");
        }





    }
}
