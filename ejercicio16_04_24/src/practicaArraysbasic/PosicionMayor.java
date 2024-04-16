package practicaArraysbasic;

import java.util.Iterator;
import java.util.ArrayList;
public class PosicionMayor implements Iterable<Integer> {
    private ArrayList<Integer>numeros;
    public PosicionMayor() {
        numeros=new ArrayList<>();
    }
    public void addNum(int j){
        numeros.add(j);
    }

    public int getMayor() {
        int mayor = 0;
        for (int n : numeros) {
            if (n > mayor) {
                mayor = n;
            }
        }
        return mayor;
    }

    public int getPosicionMayor() {
        int mayor = getMayor();
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == mayor) {
                return i;
            }
        }
        return -1;
}   @Override
    public Iterator<Integer> iterator() {
        return numeros.iterator();
    }
}
