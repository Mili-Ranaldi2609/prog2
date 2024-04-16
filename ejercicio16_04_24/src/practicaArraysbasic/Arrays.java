package practicaArraysbasic;
import java.util.Random;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner scr=  new Scanner(System.in);
       // ejercicio 1
        System.out.println("Ejercicio 1: ");

        int[] numeros1=new int [10];
        int mayor=0;
        int posicion =-1;
        System.out.println("Array de los numeros ");
        for (int i = 0; i < 10; i++) {

            System.out.println("Escriba un numero:");
            int num=scr.nextInt();
            numeros1[i]=num;
            if (num>mayor){
                posicion=i;
                mayor=num;

            }
        }
        System.out.println("El mayor numero leido es "+mayor+", en la posicion "+posicion);
        //ejercicio 2
        System.out.println("Ejercicio 2: ");

        int[] numeros2 = new int[10];
        int mayorPrimo = 0;
        int posicion2 = -1;

        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros2[i] = scr.nextInt();

            if (esPrimo(numeros2[i]) && numeros2[i] > mayorPrimo) {
                mayorPrimo = numeros2[i];
                posicion = i;
            }
        }

        if (posicion != -1) {
            System.out.println("El mayor número primo leído es " + mayorPrimo + ", en la posición " + (posicion + 1) + " del arreglo.");
        } else {
            System.out.println("No se encontró ningún número primo en el arreglo.");
        }
        //ejercicio 3
        System.out.println("Ejercicio 3:");
        int[] numerosPrimos = new int[10];
        int count = 0;

        for (int i = 100; i <= 300; i++) {
            if (esPrimo(i)) {
                numerosPrimos[count] = i;
                count++;
                if (count == 10) {
                    break;
                }
            }
        }

        System.out.println("Los 10 números primos entre 100 y 300 son:");
        for (int i = 0; i < 10; i++) {
            System.out.println(numerosPrimos[i]);
        }
        //Ejercicio 4
        System.out.println("Ejericio 4");
        int[] numeros4 = new int[10];

        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros4[i] = scr.nextInt();
        }

        System.out.println("Posiciones de los números terminados en 4:");
        for (int i = 0; i < 10; i++) {
            if (numeros4[i] % 10 == 4) {
                System.out.println("Número " + numeros4[i] + " en la posición " + i);
            }
        }
        //Ejercicio 5
        System.out.println("Ejercicio 5");
        int[] numeros5 = new int[10];
        int mayor5 = 0;
        int contadorMayor = 0;

        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros5[i] = scr.nextInt();
            if (numeros5[i] > mayor5) {
                mayor5 = numeros5[i];
                contadorMayor = 1; // Reiniciar el contador si encontramos un nuevo mayor
            } else if (numeros5[i] == mayor5) {
                contadorMayor++; // Incrementar el contador si encontramos otro número igual al mayor
            }
        }

        System.out.println("El mayor número ingresado es: " + mayor5);
        System.out.println("Se repite " + contadorMayor + " vez/veces.");
    }
    //metodo ejercicio 2 y 3
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

}





