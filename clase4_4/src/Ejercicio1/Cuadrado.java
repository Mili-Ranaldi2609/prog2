package Ejercicio1;

public class Cuadrado implements Figura,Rotable,Dibujable {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Se dibujo el cuadrado ■ ");
    }

    @Override
    public double area() {
        return lado*lado;
    }

    @Override
    public void rotar() {
        System.out.println("Se roto el cuadrado ■■");
    }
}
