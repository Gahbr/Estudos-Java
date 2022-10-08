package Collections.ExemploMAP;

import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Crie um dicionario que relacione os modelos e seus respectivos consumos");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
           put("Gol",14.4);
           put("Uno",15.6);
           put("Mobi",16.1);
           put("HB20",14.5);
           put("Kwid",15.6);
        }};

        System.out.println(carrosPopulares.toString() + "\n");

        System.out.println("--Substitua o consumo do gol por 15.2km/l--");
        carrosPopulares.put("Gol",15.2);
        System.out.println(carrosPopulares +"\n");

        System.out.println("--Confira se o modelo tucson está no dicionário--");
        System.out.println(carrosPopulares.containsKey("tucson" )+"\n");

        System.out.println("--Exiba o consumo do uno --");
        System.out.println(carrosPopulares.get("Uno")+"\n");

        System.out.println("--Exiba os modelos-- ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos +"\n");

        System.out.println("--Exiba o consumo dos carros--");
        Collection<Double> consumo= carrosPopulares.values();
        System.out.println(consumo +"\n");

        System.out.println("--Exiba o modelo mais economico e seu consumo--");
        Double consumoEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String,Double>> entries = carrosPopulares.entrySet();
        String modeloEficiente = "";

        for(Map.Entry<String,Double> entry: carrosPopulares.entrySet()){
            if(entry.getValue().equals(consumoEficiente)) modeloEficiente = entry.getKey();
        }
        System.out.println( modeloEficiente + " - "+ consumoEficiente+"km/l"+"\n");


        System.out.println("--Modelo menos economico--");
        Double piorConsumo = Collections.min(carrosPopulares.values());
        String piorModelo = "";
        for (Map.Entry<String,Double> entry : entries){
            if(entry.getValue().equals(piorConsumo)) piorModelo = entry.getKey();
        }
        System.out.println(piorModelo + " - "+ piorConsumo+"km/l" +"\n");

        System.out.println("--Exiba a soma dos consumos--");
        Iterator<Double> iterator=  carrosPopulares.values().iterator();
        Double soma = 0d;

        while(iterator.hasNext()){
            soma+= iterator.next();
        }
        System.out.println("Soma: "+soma + "\n");


        System.out.println("--Em ordem que foram informados--");
        Map<String, Double> carrosOrdem = new LinkedHashMap<>(){{
            put("Gol",14.4);
            put("Uno",15.6);
            put("Mobi",16.1);
            put("HB20",14.5);
            put("Kwid",15.6);
        }};
        System.out.println(carrosOrdem.toString() + "\n");

        System.out.println("--Ordem pelo Modelo--");
        Map<String, Double> carrosOrdemModelo = new TreeMap<>(carrosPopulares);
        System.out.println(carrosOrdemModelo.toString());

    }
}
