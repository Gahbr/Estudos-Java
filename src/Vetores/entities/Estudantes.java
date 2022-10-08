package Vetores.entities;

public class Estudantes {
    private String name, email;
    private double nota1,nota2;

    public Estudantes(String name, double nota1, double nota2) {
        this.name = name;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getName() {
        return name;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }
}
