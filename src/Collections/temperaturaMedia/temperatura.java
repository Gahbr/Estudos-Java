package Collections.temperaturaMedia;

import java.util.LinkedList;
import java.util.List;

public class temperatura {
    private double temperatura;
    public int mes;

    public temperatura(double temperatura, int mes) {
        this.temperatura = temperatura;
        this.mes = mes;
    }

    public  double getTemperatura() {
        return this.temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "temperatura{" +
                "temperatura=" + temperatura +
                ", mes='" + mes + '\'' +
                '}';
    }

    public double mediaSemestral(){
        return 2;
    }

    public double calculateAverage(LinkedList<Integer> marks) {
        return marks.stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);
    }
}


