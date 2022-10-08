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
        System.out.println("População do nordeste");
        System.out.println(populacaoNordeste.toString());

        //Substitua a população do estado do RN por 3.534.165;
        populacaoNordeste.put("RN",3534165);
        System.out.println(populacaoNordeste.toString() + "\n");

        //Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;
        System.out.println("Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277");
        if(!populacaoNordeste.containsKey("PB")){
            populacaoNordeste.put("PB",4039277);
            for(Map.Entry<String,Integer> estado : populacaoNordeste.entrySet()){
                System.out.println("Estado: "+ estado.getKey() + " População: "+estado.getValue());
            }
        }
        System.out.println();
        //Exiba a população PE;
        for(Map.Entry<String, Integer> estado  : populacaoNordeste.entrySet()){
            if(estado.getKey().equals("PE")){
                System.out.println("População de Pernambuco:"+ df.format(estado.getValue())+ "\n");
            }
        }

        //Exiba os estados e suas populações em ordem alfabética;
        System.out.println("Exiba os estados e suas populações em ordem alfabética");
        Map<String,Integer> ordemEstados = new TreeMap<>(populacaoNordeste);
        System.out.println(ordemEstados.toString()+ "\n");

        //Exiba o estado com o menor população e sua quantidade;
        System.out.println("Exiba o estado com o menor população e sua quantidade");
        System.out.println( Collections.min(populacaoNordeste.keySet())+ "- " + Collections.min(populacaoNordeste.values())+ "\n");

        //Exiba o estado com a maior população e sua quantidade;
        System.out.println("Exiba o estado com a maior população e sua quantidade");
        System.out.println( Collections.max(populacaoNordeste.keySet()) + "- " + Collections.max(populacaoNordeste.values()) + "\n");

        //Exiba a soma da população desses estados;
        System.out.println("Exiba a soma da população desses estados");
        Iterator<Integer> iterator = populacaoNordeste.values().iterator();
        int soma = 0;
        while(iterator.hasNext()){
            soma+= iterator.next();

        };
        System.out.println(df.format(soma) + "\n");

        //Exiba a média da população deste dicionário de estados;
        System.out.println("Exiba a média da população deste dicionário de estados");
        System.out.println("Média de população dos estados: "+ df.format(soma/populacaoNordeste.size())+"\n");

        //Remova os estados com a população menor que 4.000.000;
        System.out.println("Remova os estados com a população menor que 4.000.000");
        Iterator<Integer> iterator1 = populacaoNordeste.values().iterator();
            while(iterator1.hasNext()){
                if(iterator1.next()< 4000000){
                    iterator1.remove();
                }
            }
        System.out.println(populacaoNordeste+"\n");

        //Apague o dicionário de estados;
        System.out.println("Apague o dicionário de estados");
        populacaoNordeste.clear();
        System.out.println(populacaoNordeste+ "\n");

        //Confira se o dicionário está vazio.
        System.out.println("Confira se o dicionário está vazio: "+ populacaoNordeste.isEmpty());

















    }
}
