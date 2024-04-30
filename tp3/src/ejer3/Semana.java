package ejer3;
import java.util.ArrayList;
import java.util.Iterator;
public class Semana {
    public static void main(String[] args) {
        ArrayList<String> days= new ArrayList<>();
        days.add("Lunes");
        days.add("Martes");
        days.add("Miércoles");
        days.add("Jueves");
        days.add("Viernes");
        days.add("Sábado");
        days.add("Domingo");
        days.add(3, "Juernes");
//Muestro la posicion 3 y 4
        System.out.println("Elemento en posición 3: " + days.get(2));
        System.out.println("Elemento en posición 4: " + days.get(3));
// Muestro el primer y último elemento
        System.out.println("Primer elemento: " + days.get(0));
        System.out.println("Último elemento: " + days.get(days.size() - 1));
// Elimino el elemento "Juernes" y compruebo
        if (days.remove("Juernes")) {
            System.out.println("Elemento 'Juernes' eliminado correctamente.");
        } else {
            System.out.println("Error al eliminar el elemento 'Juernes'.");
        }
        System.out.println("Elemento en posición 4: " + days.get(3));
// Creo un iterador y muestro los valores uno a uno
        System.out.println("Elementos de la lista:");
        Iterator<String> iterator = days.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
// Busco si existe "Lunes" en la lista
        if (days.contains("Lunes")) {
            System.out.println("Se encontró 'Lunes' en la lista.");
        } else {
            System.out.println("No se encontró 'Lunes' en la lista.");
        }

// Borro todos los elementos de la lista
        days.clear();
        if (days.isEmpty()) {
            System.out.println("Lista vaciada correctamente.");
        } else {
            System.out.println("Error al vaciar la lista.");
        }

    }

}
