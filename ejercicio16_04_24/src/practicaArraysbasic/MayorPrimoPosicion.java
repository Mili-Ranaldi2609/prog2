package practicaArraysbasic;

import java.util.ArrayList;
import java.util.Iterator;

public class MayorPrimoPosicion implements Iterable<Integer>{
    private ArrayList<Integer> numeros;

    public MayorPrimoPosicion() {
        numeros=new ArrayList<>();
    }
    public void addNum(int j){
        numeros.add(j);
    }
    public int getmayorPrimo(){
        int mayorPrimo = 0;
        for (int num : numeros) {
            if (esPrimo(num) && num > mayorPrimo) {
                mayorPrimo = num;
            }
        }
        return mayorPrimo;
    }
    public int getPosicionMayorPrimo() {
        int mayorPrimo = getmayorPrimo();
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == mayorPrimo) {
                return i;
            }
        }
        return -1;
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

