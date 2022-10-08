package POO.notas.entities;

public class Student {
    public String name;
    public double nota1, nota2, nota3;

public double FinalGrade(){
    return nota1+nota2+nota3;
}

public String checkGrades(){
    if(FinalGrade()>=60){
        return "PASS";
    }else {
        return "FAILED" + "\n" +"MISSING "+ (60-FinalGrade()) + " POINTS";
    }
}
}
