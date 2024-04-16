package practicaArraysbasic;
import java.util.ArrayList;
import java.util.Iterator;
public class RepetidoMayor implements Iterable<Integer> {
    private ArrayList<Integer> numeros;

    public RepetidoMayor() {
        numeros = new ArrayList<>();
    }

    public void addNumero(int num) {
        numeros.add(num);
    }

    public int contarRepetidosDelMayor() {
        int mayor = getMayor();
        int contador = 0;
        for (int num : numeros) {
            if (num == mayor) {
                contador++;
            }
        }
        return contador;
    }

    private int getMayor() {
        int mayor = Integer.MIN_VALUE;
        for (int num : numeros) {
            if (num > mayor) {
                mayor = num;
            }
        }
        return mayor;
    }

    @Override
    public Iterator<Integer> iterator() {
        return numeros.iterator();
    }}