package practicaArraysbasic;

import java.util.ArrayList;
import java.util.Iterator;

public class DiezPrimos implements Iterable<Integer>{
    private ArrayList<Integer> numeros;

    public DiezPrimos() {
        numeros = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            numeros.add(0);
        }
    }

    public void llenarArreglo() {
        int count = 0;
        for (int i = 100; i <= 300; i++) {
            if (esPrimo(i)) {
                numeros.set(count, i);
                count++;
            }
            if (count == 10) {
                break;
            }
        }
    }

    public void mostrarNumeros() {
        for (int num : numeros) {
            System.out.println(num);
        }
    }

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
    @Override
    public Iterator<Integer> iterator() {
        return numeros.iterator();
    }
}
