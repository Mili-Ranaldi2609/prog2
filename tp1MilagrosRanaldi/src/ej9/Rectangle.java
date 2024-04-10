package ej9;

public class Rectangle extends GeometricFigure{
    private double lenght;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void calcularArea() {
        System.out.println("El area del rectangulo es: "+(lenght*width));
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El perimetro del rectangulo es: "+((2*lenght)+(2*width)));
    }
}
