package practicaArraysbasic;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scr=  new Scanner(System.in);
        // ejercicio 1
        System.out.println("Ejercicio 1: ");

        PosicionMayor numerosIterable = new PosicionMayor();

        for (int i = 0; i < 10; i++) {
            System.out.println("Escriba un número:");
            int num = scr.nextInt();
            numerosIterable.addNum(num);
        }

        System.out.println("El mayor número leído es " + numerosIterable.getMayor() +
                ", en la posición " + numerosIterable.getPosicionMayor());
        // ejercicio 2
        System.out.println("Ejercicio 2: ");
        MayorPrimoPosicion numeros2 = new MayorPrimoPosicion()
                ;

        for (int i = 0; i < 10; i++) {
            System.out.println("Escriba un número:");
            int num = scr.nextInt();
            numeros2.addNum(num);
        }

        int mayorPrimo = numeros2.getmayorPrimo();
        int posicionMayorPrimo = numeros2.getPosicionMayorPrimo();

        if (posicionMayorPrimo != -1) {
            System.out.println("El mayor número primo leído es " + mayorPrimo +
                    ", en la posición " + posicionMayorPrimo);
        } else {
            System.out.println("No se encontró ningún número primo en la lista.");
        }

        // ejercicio 3
        System.out.println("Ejercicio 3");
        DiezPrimos diezPrimos = new DiezPrimos();
        diezPrimos.llenarArreglo();
        diezPrimos.mostrarNumeros();

        // ejercicio 4
        System.out.println("Ejercicio 4");
        TerminadosNumcuatro terminadosNumcuatro = new TerminadosNumcuatro();

        for (int i = 0; i < 10; i++) {
            System.out.println("Escriba un número:");
            int num = scr.nextInt();
            terminadosNumcuatro.addNum(num);
        }

        ArrayList<Integer> posicionesCuatro = terminadosNumcuatro.getPosicionesCuatro();

        if (posicionesCuatro.isEmpty()) {
            System.out.println("No se encontraron números terminados en 4.");
        } else {
            System.out.println("Números terminados en 4 encontrados en las posiciones:");
            for (int pos : posicionesCuatro) {
                System.out.println(pos);
            }
        }
        // ejercicio 5
        System.out.println("Ejercicio 5");
        RepetidoMayor repetidoMayor = new RepetidoMayor();

        for (int i = 0; i < 10; i++) {
            System.out.println("Escriba un número:");
            int num = scr.nextInt();
            repetidoMayor.addNumero(num);
        }

        int vecesRepetido = repetidoMayor.contarRepetidosDelMayor();
        System.out.println("El mayor número está repetido " + vecesRepetido + " veces.");
    }

}
