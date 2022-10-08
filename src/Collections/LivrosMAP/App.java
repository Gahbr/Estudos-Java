package Collections.LivrosMAP;

import java.util.*;

public class App {
    public static void main(String[] args) {

        System.out.println("Ordem aleat�ria");
        Map<String,Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve hist�ria no tempo",256));
            put("Duhigg, Charles", new Livro("O poder do h�bito",408));
            put("Harari, Yuval Noah", new Livro("21 li��es para o s�culo 21",432));
        }};
        for(Map.Entry<String,Livro> livro : meusLivros.entrySet()){
            System.out.println(livro.getKey() + "- " + livro.getValue().getNome());
        }
        System.out.println();

        System.out.println("Ordem de inser��o");
        Map<String, Livro> livroPorInsert = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve hist�ria no tempo",256));
            put("Duhigg, Charles", new Livro("O poder do h�bito",408));
            put("Harari, Yuval Noah, Stephen", new Livro("21 li��es para o s�culo 21",432));
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

        System.out.println("Ordem por n�mero de p�ginas");
        Set<Map.Entry <String,Livro>> livroPorPag = new TreeSet<>(new ComparatorPaginas());
        livroPorPag.addAll(meusLivros.entrySet());

        for(Map.Entry<String,Livro> livro : livroPorPag){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getPaginas() + " P�ginas");
        }





    }
}
