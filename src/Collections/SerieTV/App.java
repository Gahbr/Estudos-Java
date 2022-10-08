package Collections.SerieTV;

import java.util.*;

public class App {
    public static void main(String[] args) {

        //ordem aleatoria
        System.out.println("Ordem aleatoria");
        Set<Serie> minhaSerie = new HashSet<>(){{
           add(new Serie("got","fantasia",60));
           add(new Serie("dexter","crime",60));
           add(new Serie("the office","fantasia",25));
        }};

        for (Serie serie:minhaSerie) {
            System.out.println(serie.getNome() + " - Genero: "+serie.getGenero() + "- duração do episódio: "+ serie.getTempoEpisodio());
        }
        System.out.println("----------");


        //ordem de inserção
        System.out.println("ordem de inserção");
        Set<Serie> minhaSerie2 = new LinkedHashSet<>(){{
            add(new Serie("got","fantasia medieval",60));
            add(new Serie("dexter","crime",60));
            add(new Serie("spartacus","fantasia medieval",55));
            add(new Serie("the office","comédia",25));
        }};

        for (Serie serie:minhaSerie2) {
            System.out.println(serie.getNome() + " - Genero: "+serie.getGenero() + "- duração do episódio: "+ serie.getTempoEpisodio());
        }
        System.out.println("---------");

        //por ordem natural
        Set<Serie> minhaSerie3 = new TreeSet<>(minhaSerie2);
        for (Serie serie:minhaSerie3) {
            System.out.println(serie.getNome() + " - Genero: "+serie.getGenero() + "- duração do episódio: "+ serie.getTempoEpisodio());
        }
        System.out.println();

        //ordem por genero
        System.out.println("ordem de gênero");
        Set<Serie> minhaSerie4= new TreeSet<>(new ComparatorGenero());
        minhaSerie4.addAll(minhaSerie2);
        for (Serie serie:minhaSerie4) {
            System.out.println(serie.getNome() + " - Genero: "+serie.getGenero() + "- duração do episódio: "+ serie.getTempoEpisodio());
        }
    }




    static class Serie implements Comparable<Serie>{
        private String nome, genero;
        private Integer tempoEpisodio;

        public Serie(String nome, String genero, Integer tempoEpisodio) {
            this.nome = nome;
            this.genero = genero;
            this.tempoEpisodio = tempoEpisodio;
        }

        public String getNome() {
            return nome;
        }

        public String getGenero() {
            return genero;
        }

        public Integer getTempoEpisodio() {
            return tempoEpisodio;
        }

        @Override
        public String toString() {
            return "Serie{" +
                    "nome='" + nome + '\'' +
                    ", genero='" + genero + '\'' +
                    ", tempoEpisodio=" + tempoEpisodio +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Serie serie = (Serie) o;
            return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome, genero, tempoEpisodio);
        }

        @Override
        public int compareTo(Serie serie) {
            int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
            if (tempoEpisodio!=0) return tempoEpisodio;
            return getGenero().compareTo(serie.getGenero());

        }
    }

     static class ComparatorGenero implements Comparator<Serie> {
        @Override
        public int compare(Serie s1, Serie s2) {
            int genero = s1.getGenero().compareTo(s2.getGenero());
            if (genero!=0) return genero;

            return s1.getNome().compareTo(s2.getNome());

        }

    }

}
