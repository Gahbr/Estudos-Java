package Collections.temperaturaMedia;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        LinkedList lista = new LinkedList();
        LinkedList <Integer> marks = new LinkedList();

        marks.add(10);
        marks.add(12);
        marks.add(14);
        marks.add(15);
        marks.add(20);
        marks.add(30);


        //ordenando a lista
        Collections.sort(lista, new Comparator<temperatura>() {
            @Override
            public int compare(temperatura o1, temperatura o2) {
                return o1.getMes() - o2.getMes();
            }
        });


        double mediaSemestral = calculo.calculateAverage(marks);
        System.out.printf("A media semestral da temperatura é %.2fº Celsius %n" ,mediaSemestral);
        System.out.println();
        System.out.println("Temperaturas que estão acima da média: ");
        System.out.println("----------------");

        for (int i = 0; i < marks.size(); i++) {

            int indexMes = marks.indexOf(marks.get(i));
            indexMes+=1;

            if(marks.get(i)> mediaSemestral){
                switch(indexMes) {
                    case 1:
                        String Mes = "Janeiro";
                        System.out.println( "Mes: "+Mes + " Temperatura: "+marks.get(i));
                        break;

                    case 2:
                        Mes = "Fevereiro";
                        System.out.println( "Mes: "+Mes + " Temperatura: "+marks.get(i));
                        break;

                    case 3:
                        Mes = "Março";
                        System.out.println( "Mes: " + " Temperatura: "+marks.get(i));
                        break;

                    case 4:
                        Mes = "Abril";
                        System.out.println( "Mes: " + " Temperatura: "+marks.get(i));
                        break;

                    case 5:
                        Mes = "Maio";
                        System.out.println( "Mes: "+Mes + " Temperatura: "+marks.get(i));
                        break;

                    case 6:
                        Mes = "Junho";
                        System.out.println( "Mes: "+Mes + " Temperatura: "+marks.get(i));
                        break;
                }
            }
        }

    }

    public static class calculo{
        public static double calculateAverage(LinkedList<Integer> marks) {
            return marks.stream()
                    .mapToDouble(d -> d)
                    .average()
                    .orElse(0.0);
        }
    }

}

