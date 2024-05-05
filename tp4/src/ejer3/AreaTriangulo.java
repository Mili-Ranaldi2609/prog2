package ejer3;
import java.util.Scanner;
import java.util.InputMismatchException;
public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        try {
            System.out.print("Ingrese la base del triangulo: ");
            double base = scr.nextDouble();

            System.out.print("Ingrese la altura del triangulo: ");
            double altura = scr.nextDouble();

            if (base <= 0 || altura <= 0) {
                throw new IllegalArgumentException("La base y la altura deben ser valores positivos.");
            }

            double area = (base * altura) / 2;
            System.out.println("El area del triángulo es: " + area);
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar valores numéricos.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());//esto se usa cuando los numeros ingresados son negativos
        } finally {
            scr.close();
        }
    }
}