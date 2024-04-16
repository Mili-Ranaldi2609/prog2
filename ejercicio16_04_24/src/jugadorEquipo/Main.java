package jugadorEquipo;

public class Main {
    public static void main(String[] args) {
        Equipo equipo= new Equipo();
        equipo.addJugador(new Jugador("Lionel Messi","delantero",10,36));
        equipo.addJugador(new Jugador("Leandro Paredes","centrocampista",5,29));
        System.out.println("Mostrando los jugadores del equipo");
        for(Jugador j: equipo) {
           System.out.println("Nombre: "+j.getNombre()+", Numero de camiseta: "+j.getNumCamiseta());
       }
    }
}
