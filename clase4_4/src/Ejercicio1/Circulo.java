package Ejercicio1;

public class Circulo implements Figura,Dibujable{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Se dibujo el circulo  ○ ");

    }

    @Override
    public double area() {
        double a;
        a=Math.PI*Math.pow(getRadio(),2);
        return a;
    }
}
