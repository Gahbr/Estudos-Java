package Collections.LinguagemFavorita;

import Collections.SerieTV.App;

import java.util.Comparator;

public class LinguagemFavorita  implements Comparable<LinguagemFavorita> {
    private String nome, ide;
    private int anoCriacao;

    public LinguagemFavorita(String nome, String ide, int anoCriacao) {
        this.nome = nome;
        this.ide = ide;
        this.anoCriacao = anoCriacao;
    }

    public String getNome() {
        return nome;
    }

    public String getIde() {
        return ide;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    @Override
    public String toString() {
        return "Linguagem: "+ this.getNome() + " : "+this.getIde() + " Ano de criação: "+this.getAnoCriacao() + '\n';
    }

    @Override
    public int compareTo(LinguagemFavorita o) {
        int ling = getNome().compareTo(o.getNome());
        if (ling!=0) return ling;

        return getNome().compareTo(o.getNome());
    }
}

class  ComparatorIDE implements Comparator<LinguagemFavorita> {
    public int compare(LinguagemFavorita s1, LinguagemFavorita s2) {
        int ide = s1.getIde().compareTo(s2.getIde());
        if (ide!=0) return ide;

        return s1.getNome().compareTo(s2.getNome());

    }}

class ComparatorYearName implements Comparator<LinguagemFavorita>{
    public int compare(LinguagemFavorita s1, LinguagemFavorita s2) {
        int ano =  Integer.compare(s1.getAnoCriacao(),s2.getAnoCriacao());
        if (ano!=0) return ano;

        int nome = s1.getNome().compareTo(s2.getNome());
        if(nome!=0) return nome;

        return s1.getIde().compareTo(s2.getIde());

    }
}
