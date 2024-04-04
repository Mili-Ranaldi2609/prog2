package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Circulo c1= new Circulo(25);
        Cuadrado cu1= new Cuadrado(16);
        System.out.println("El area del circulo es: "+c1.area());
        c1.dibujar();
        System.out.println("El area del cuadrado es: "+cu1.area());
        cu1.dibujar();
        cu1.rotar();
    }
}