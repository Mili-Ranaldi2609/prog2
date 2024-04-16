package jugadorEquipo;

import java.util.Iterator;
import java.util.ArrayList;
public class Equipo implements Iterable<Jugador> {
    private ArrayList<Jugador> jugadores;

    public Equipo() {
        jugadores=new ArrayList<>();
    }
    public void addJugador(Jugador j){
        jugadores.add(j);
    }
    @Override
    public Iterator<Jugador> iterator(){
        return jugadores.iterator();
    }

}
