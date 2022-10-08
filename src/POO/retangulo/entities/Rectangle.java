package POO.retangulo.entities;

public class Rectangle {
    public double width;
    public double height;

    public double Area(){
        return this.height * this.width;
    }

    public double Perimeter(){
        return  2*(this.width+this.height);
    }

    public double Diagonal(){
        return Math.sqrt( (Math.pow(this.height,2)+ Math.pow(this.width,2)));
    }

    @Override
    public String toString() {
        return String.format("AREA: %.2f %nPERIMETER: %.2f %nDIAGONAL: %.2f %n", Area(),Perimeter(),Diagonal());
    }
}
