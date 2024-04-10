package ej9;

public class Circle extends GeometricFigure{
    private double radio;

    public Circle() {
    }

    public Circle(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        System.out.println("El area del circulo es igual a: "+(3.14*(radio*radio)));
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El perimetro del circulo es igual a: "+(2*3.14*radio));
    }
}
