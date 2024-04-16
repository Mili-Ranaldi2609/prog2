package practicaArraysbasic;

import java.util.ArrayList;
import java.util.Iterator;

public class TerminadosNumcuatro implements Iterable<Integer>{
    private ArrayList<Integer> numeros;

    public TerminadosNumcuatro() {
        numeros=new ArrayList<>();
    }
    public void addNum(int j){
        numeros.add(j);
    }
    public ArrayList<Integer> getPosicionesCuatro() {
        ArrayList<Integer> posiciones = new ArrayList<>();
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 10 == 4) {
                posiciones.add(i);
            }
        }
        return posiciones;
    }
    @Override
    public Iterator<Integer> iterator() {
        return numeros.iterator();
    }
}
