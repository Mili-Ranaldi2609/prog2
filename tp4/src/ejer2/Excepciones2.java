package ejer2;
import java.util.Scanner;
public class Excepciones2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double n;
        int posicion;
        String cadena ;
        double[] valores = {9.83, 4.5, -3.06, 0.06, 2.52, -11.3, 7.60, 3.00, -30.4, 105.2};
        System.out.println("Contenido del array antes de modificar:");
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("%.2f ", valores[i]);
        }

        try {
            System.out.print("\n\nIntroduce la posicion del array a modificar: ");
            cadena = sc.nextLine();
            posicion = Integer.parseInt(cadena);

            if (posicion < 0 || posicion >= valores.length) {
                throw new IndexOutOfBoundsException("La posicion está fuera del rango del array.");
            }

            System.out.print("\nIntroduce el nuevo valor de la posicion " + posicion + ": ");
            n = sc.nextDouble();
            valores[posicion] = n;

            System.out.println("\nPosicion a modificar " + posicion);
            System.out.println("Nuevo valor: " + n);
            System.out.println("Contenido del array modificado:");
            for (int i = 0; i < valores.length; i++) {
                System.out.printf("%.2f ", valores[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: La entrada no es un numero entero valido.");//se utiliza para introducir el valor de la posicion del numero que se quiere cambiar
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: La posicion esta fuera del rango del array.");
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
