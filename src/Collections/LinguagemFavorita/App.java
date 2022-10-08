package Collections.LinguagemFavorita;


import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {

        Set<Collections.LinguagemFavorita.LinguagemFavorita> linguagens = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Javascript", "visual studio code", 1995));
            add(new LinguagemFavorita("Java", "Intellij", 1996));
            add(new LinguagemFavorita("PHP", "PhpStorm", 1995));
        }};

        System.out.println("ORDEM DE INSERÇÃO");
        for (LinguagemFavorita linguagemFavorita : linguagens) {
            System.out.println("Linguagem: " + linguagemFavorita.getNome() + " : " + linguagemFavorita.getIde() + " Ano de criação: " + linguagemFavorita.getAnoCriacao());
        }
        System.out.println("------------------------------");

        //Por ordem natural

        Set<Collections.LinguagemFavorita.LinguagemFavorita> linguagensPorNome = new TreeSet<>(linguagens);
        System.out.println("ORDEM NATURAL(NOME) ");
        for (LinguagemFavorita linguagemFavorita : linguagensPorNome) {
            System.out.println("Linguagem: " + linguagemFavorita.getNome() + " : " + linguagemFavorita.getIde() + " Ano de criação: " + linguagemFavorita.getAnoCriacao());
        }
        System.out.println("------------------------------");

        //por IDE
        Set<Collections.LinguagemFavorita.LinguagemFavorita> linguagensPorIDE = new TreeSet<>(new ComparatorIDE());
        linguagensPorIDE.addAll(linguagens);
        for(LinguagemFavorita linguagemFavorita: linguagensPorIDE){
            System.out.println("Linguagem: " + linguagemFavorita.getNome() + " : " + linguagemFavorita.getIde() + " Ano de criação: " + linguagemFavorita.getAnoCriacao());
        }
        System.out.println("------------------------------");


        //POR ANO DE CRIACAO E NOME
        System.out.println("ORDEM POR ANO DE CRIAÇÃO E NOME");
        Set<Collections.LinguagemFavorita.LinguagemFavorita> linguagensAnoNome = new TreeSet<>(new ComparatorYearName());
        linguagensAnoNome.addAll(linguagens);
        for (LinguagemFavorita linguagemFavorita:linguagensAnoNome){
            System.out.println("Linguagem: " + linguagemFavorita.getNome() + " : " + linguagemFavorita.getIde() + " Ano de criação: " + linguagemFavorita.getAnoCriacao());
        }


    }
}
