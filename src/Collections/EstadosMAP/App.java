package Collections.EstadosMAP;

import Collections.LivrosMAP.Livro;

import java.text.DecimalFormat;
import java.util.*;

public class App {
    public static void main(String[] args) {
        new DecimalFormat("#,###.##");
        DecimalFormat df = (DecimalFormat) DecimalFormat.getInstance(Locale.US);

        Map<String, Integer> populacaoNordeste = new LinkedHashMap<>(){{
            put("PE",9616621);
            put("AL", 3351543);
            put("CE",9187103);
            put("RN",3534265);
        }};
        System.out.println("Popula��o do nordeste");
        System.out.println(populacaoNordeste.toString());

        //Substitua a popula��o do estado do RN por 3.534.165;
        populacaoNordeste.put("RN",3534165);
        System.out.println(populacaoNordeste.toString() + "\n");

        //Confira se o estado PB est� no dicion�rio, caso n�o adicione: PB - 4.039.277;
        System.out.println("Confira se o estado PB est� no dicion�rio, caso n�o adicione: PB - 4.039.277");
        if(!populacaoNordeste.containsKey("PB")){
            populacaoNordeste.put("PB",4039277);
            for(Map.Entry<String,Integer> estado : populacaoNordeste.entrySet()){
                System.out.println("Estado: "+ estado.getKey() + " Popula��o: "+estado.getValue());
            }
        }
        System.out.println();
        //Exiba a popula��o PE;
        for(Map.Entry<String, Integer> estado  : populacaoNordeste.entrySet()){
            if(estado.getKey().equals("PE")){
                System.out.println("Popula��o de Pernambuco:"+ df.format(estado.getValue())+ "\n");
            }
        }

        //Exiba os estados e suas popula��es em ordem alfab�tica;
        System.out.println("Exiba os estados e suas popula��es em ordem alfab�tica");
        Map<String,Integer> ordemEstados = new TreeMap<>(populacaoNordeste);
        System.out.println(ordemEstados.toString()+ "\n");

        //Exiba o estado com o menor popula��o e sua quantidade;
        System.out.println("Exiba o estado com o menor popula��o e sua quantidade");
        System.out.println( Collections.min(populacaoNordeste.keySet())+ "- " + Collections.min(populacaoNordeste.values())+ "\n");

        //Exiba o estado com a maior popula��o e sua quantidade;
        System.out.println("Exiba o estado com a maior popula��o e sua quantidade");
        System.out.println( Collections.max(populacaoNordeste.keySet()) + "- " + Collections.max(populacaoNordeste.values()) + "\n");

        //Exiba a soma da popula��o desses estados;
        System.out.println("Exiba a soma da popula��o desses estados");
        Iterator<Integer> iterator = populacaoNordeste.values().iterator();
        int soma = 0;
        while(iterator.hasNext()){
            soma+= iterator.next();

        };
        System.out.println(df.format(soma) + "\n");

        //Exiba a m�dia da popula��o deste dicion�rio de estados;
        System.out.println("Exiba a m�dia da popula��o deste dicion�rio de estados");
        System.out.println("M�dia de popula��o dos estados: "+ df.format(soma/populacaoNordeste.size())+"\n");

        //Remova os estados com a popula��o menor que 4.000.000;
        System.out.println("Remova os estados com a popula��o menor que 4.000.000");
        Iterator<Integer> iterator1 = populacaoNordeste.values().iterator();
            while(iterator1.hasNext()){
                if(iterator1.next()< 4000000){
                    iterator1.remove();
                }
            }
        System.out.println(populacaoNordeste+"\n");

        //Apague o dicion�rio de estados;
        System.out.println("Apague o dicion�rio de estados");
        populacaoNordeste.clear();
        System.out.println(populacaoNordeste+ "\n");

        //Confira se o dicion�rio est� vazio.
        System.out.println("Confira se o dicion�rio est� vazio: "+ populacaoNordeste.isEmpty());

















    }
}
